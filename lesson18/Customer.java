import java.util.ArrayList;
import java.util.List;

public class Customer {
    /**
     * Attribute of Customer class.
     */
    private long idNumber;
    private String fullName;
    private List<Account> accountList;

    /**
     * Initialize Customer object without parameters.
     */
    public Customer() {

    }

    /**
     * Initialize Customer object with 2 parameters.
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.accountList = new ArrayList<Account>();
    }

    public String getCustomerInfo() {
        return "Số CMND: " + this.idNumber + ". Họ tên: " + this.fullName + ".";
    }

    /**
     * Add a new account.
     */
    public void addAccount(Account account) {
        if(this.accountList.contains(account)) {
            return;
        }
        this.accountList.add(account);
    }

    /**
     * Remove the account of the customer.
     */
    public void removeAccount(Account account) {
        if (this.accountList.contains(account)) {
            this.accountList.remove(account);
        }
    }

    /**
     * Get the ID number of the customer.
     */
    public long getIdNumber() {
        return this.idNumber;
    }

    /**
     * Set the ID number of the customer.
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Get the full name of the customer.
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Set the full name of the customer.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Get the account list of the customer.
     */
    public List<Account> getAccountList() {
        return this.accountList;
    }
}