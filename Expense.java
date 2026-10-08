import java.io.Serializable;

public class Expense implements Serializable {

    private static final long serialVersionUID = 1L;

    private String date;
    private String category;
    private double amount;
    private String description;

    public Expense(String date, String category, double amount, String description) {
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Date: " + date +
               " | Category: " + category +
               " | Amount: ₹" + amount +
               " | Description: " + description;
    }
}