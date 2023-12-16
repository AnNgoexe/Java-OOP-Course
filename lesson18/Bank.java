import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    /**
     * Attribute of Bank class.
     */
    private List<Customer> customerList = new ArrayList<Customer>();

    /**
     * Read the customer list.
     */
    public void readCustomerList(InputStream inputStream) {
        try {
            InputStreamReader input = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(input);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] s = line.split(" ");
                if (!Character.isLetter(s[0].charAt(0))) {
                    long id = Long.parseLong(s[3]);
                    String name = String.join(" ", s[0], s[1], s[2]);
                    this.customerList.add(new Customer(id, name));
                } else {
                    long accountNumber = Long.parseLong(s[0]);
                    String accountType = s[1];
                    double balance = Double.parseDouble(s[2]);
                    Account account;
                    if (accountType.equals("CHECKING")) {
                        account = new CheckingAccount(accountNumber, balance);
                    } else {
                        account = new SavingsAccount(accountNumber, balance);
                    }
                    this.customerList.get(this.customerList.size() - 1).addAccount(account);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Sort by ID and get customer list.
     */
    public String getCustomersInfoByIdOrder() {
        this.customerList.sort((Customer c1, Customer c2)  
                            -> Long.compare(c1.getIdNumber(), c2.getIdNumber()));
        StringBuilder info = new StringBuilder();
        for (Customer customer : this.customerList) {
            info.append(customer.toString()).append("\n");
        }
        return info.toString();
    }

    /**
     * Sort by Name and get customer list.
     */
    public String getCustomersInfoByNameOrder() {
        this.customerList.sort((Customer c1, Customer c2)  
                            -> c1.getFullName().compareTo(c2.getFullName()));
        StringBuilder sb = new StringBuilder();
        for (Customer customer : this.customerList) {
            sb.append("Họ tên: ").append(customer.getFullName());
            sb.append(". Số CMND: ").append(customer.getIdNumber());
            sb.append(".\n");
        }
        return sb.toString();
    }

    /**
     * Get the list of customers.
     */
    public List<Customer> getCustomerList() {
        return this.customerList;
    }
}
