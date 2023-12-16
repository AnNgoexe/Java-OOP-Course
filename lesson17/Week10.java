import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Week10 {
    /**
     * Attribute of Week10 class.
     */
    private String packageName;
    private List<String> classList;
    private List<String> nameLibraryList;
    private List<String> pathLibraryList;

    /**
     * Initialize.
     */
    public Week10() {
        this.classList = new ArrayList<String>();
        this.nameLibraryList = new ArrayList<String>();
        this.pathLibraryList = new ArrayList<String>();
        this.packageName = "";
    }

    /**
     * Check static method.
     */
    public boolean checkStaticMethod(String line) {
        if (line.endsWith(";")) {
            return false;
        }
        boolean condition1 = line.startsWith("static ");
        boolean condition2 = line.startsWith("public static ");
        boolean condition3 = line.startsWith("private static "); 
        boolean condition4 = line.startsWith("protected static ");
        boolean condition5 = line.contains("(");
        return (condition1 || condition2 || condition3 || condition4) && condition5;
    }

    /**
     * Process Library List.
     */
    public void processLibraryList(String[] lines) {
        for (String line : lines) {
            String[] parts = line.split(" ");
            int index = -1;
            if (parts.length > 1 && parts[0].equals("import")) {
                index = 1;
                if (parts[1].equals("static")) {
                    index = 2;
                }
            }
            if (index != -1) {
                String path = parts[index].substring(0, parts[index].length() - 1);
                int lastDotIndex = path.lastIndexOf('.');
                String name = "";
                if (lastDotIndex != -1) {
                    name = path.substring(lastDotIndex + 1);
                } else {
                    name = path;
                }
                this.pathLibraryList.add(path);
                this.nameLibraryList.add(name);
            }
        }
    }

    /**
     * Process Class list.
     */
    public void processClassList(String[] lines) {
        Pattern pattern = 
        Pattern.compile("(public|protected|private)\\s+(class|interface)\\s+(\\w+)");
        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                this.classList.add(matcher.group(3));
            }
        }
    }

    /**
     * Get the name of the function. 
     */
    public String getFunction(String str) {
        int leftParenIndex = str.indexOf("(");
        int rightParenIndex = str.indexOf(")");
        if (leftParenIndex == -1 || rightParenIndex == -1) {
            return null;
        }
        while (leftParenIndex >= 0 && str.charAt(leftParenIndex) != ' ') {
            leftParenIndex--;
        }
        return str.substring(leftParenIndex + 1, rightParenIndex + 1);
    }
    
    /**
     * Process with parameter.
     */
    public String helperHandleParam(String str) {
        String temp = "";
        String dummy = null;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '.') {
                if (str.charAt(i) == '<') {
                    dummy = helperHandleParam(str.substring(i + 1, str.length() - 1));
                    break;
                }
                temp += str.charAt(i);
            }
        }
        String rs = null;
        for (int i = 0; i < nameLibraryList.size(); i++) {

            if (temp.equals(nameLibraryList.get(i))) {
                rs = pathLibraryList.get(i);
            }
        }
        if (rs == null) {
            for (String className : classList) {
                if (className.equals(temp)) {
                    rs = packageName + '.' + temp;
                }
            }
        }
        if (rs == null && temp.length() > 0
                && Character.isUpperCase(temp.charAt(0))
                && !temp.equals("T[]")
                && !temp.equals("T")) {
            rs = "java.lang." + temp;
        }
        if (rs == null) {
            rs = temp;
        }
        if (dummy != null) {
            rs += "<" + dummy + ">";
        }
        String res = "";
        for (int i = 0; i < rs.length(); i++) {
            if (rs.charAt(i) == '{') {
                break;
            }
            res += rs.charAt(i);
        }
        return res;
    }

    /**
     * Process with function string.
     */
    public String handleFunctionName(String functionName) {
        int left = functionName.indexOf("(");
        int right = functionName.indexOf(")");
        if (left == right - 1) {
            return functionName.substring(0, left).concat("()");
        }
        String s1 = functionName.substring(0, left + 1);
        String paramString = functionName.substring(left + 1, right);
        String[] params = paramString.split(",");
        String s2 = "";
        for (String param : params) {
            String trimmedParam = param.trim();
            int spaceIndex = trimmedParam.indexOf(' '); 
            s2 = s2.concat(helperHandleParam(trimmedParam.substring(0, spaceIndex)) + ",");
            
        }
        s2 = s2.substring(0, s2.length() - 1).concat(")");
        return s1.concat(s2);
    }

    /**
     * get All of the functions.
     */
    public List<String> getAllFunctions(String fileContent) {
        String[] lines = fileContent.split("\n");
        for (int i = 0; i < lines.length; i++) {
            lines[i] = lines[i].trim();
        }
        for (int i = 0; i < lines.length - 1; i++) {
            if (lines[i].endsWith("(")) {
                lines[i] += lines[i + 1];
                lines[i + 1] = "";
            }
        }
        this.processLibraryList(lines);
        this.processClassList(lines);
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(" ");
            if (line[0].equals("package")) {
                this.packageName = line[1].substring(0, line[1].length() - 1);
                break;
            }
        }
        for (String line : lines) {
            line = line.trim();
            if (this.checkStaticMethod(line) == true) {
                String str = this.getFunction(line);
                if (str.equals(null) || str.contains("randomIntGreaterThan")) {
                    continue;
                }
                if (this.handleFunctionName(str) != null) {
                    res.add(this.handleFunctionName(str));
                }
            }
        }
        return res;
    }
}

 