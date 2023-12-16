public class Transaction {
    /**
     * Attribute of Transaction class.
     */
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;
    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    /**
     * Initialize Transaction object with 4 parameters.
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * Get the information of type transaction.
     */
    private String getTransactionTypeString(int type) {
        switch (type) {
            case TYPE_DEPOSIT_CHECKING:
                return "Nạp tiền vãng lai";
            case TYPE_WITHDRAW_CHECKING:
                return "Rút tiền vãng lai";
            case TYPE_DEPOSIT_SAVINGS:
                return "Nạp tiền tiết kiệm";
            case TYPE_WITHDRAW_SAVINGS:
                return "Rút tiền tiết kiệm";
            default:
                return "Không xác định";
        }
    }


    /**
     * Get the information of the transaction.
     */
    public String getTransactionSummary() {
        StringBuilder sb = new StringBuilder();
        sb = sb.append("Kiểu giao dịch: ")
               .append(this.getTransactionTypeString(this.type) + ". ");
        sb = sb.append("Số dư ban đầu: $")
               .append(String.format("%.2f", this.initialBalance) + ". "); 
        sb = sb.append("Số tiền: $")
               .append(String.format("%.2f", this.amount) + ". ");
        sb = sb.append("Số dư cuối: $")
               .append(String.format("%.2f", this.finalBalance) + ". ");  
        return sb.toString();
    }
}
