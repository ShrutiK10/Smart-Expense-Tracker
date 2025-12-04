import java.util.ArrayList;

public class ExpenseManager {
    private double budget;
    private double totalExpenses = 0;
    private ArrayList<Expense> expenseList = new ArrayList<>();

    public void setBudget(double budget) {
        if (budget > 0) {
            this.budget = budget;
            System.out.println("Budget set to: " + budget);
        } else {
            System.out.println("Invalid budget amount!");
        }
    }

    // ex--> setBudget(10000);  Budget set to: 10000
    //   setBudget(-500);   Invalid budget amount!

    public void addExpense(String category, double amount, String note) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        //Iska matlab hai: Expense class ka ek naya object banao.
        //Aur constructor ko call karo jisme tum category, amount, aur note pass kar rahi ho.
        Expense e = new Expense(category, amount, note);
        expenseList.add(e);

        totalExpenses += amount;
        //Agar tumne khana khaya aur uska kharcha 250 rupaye ka tha, toh amount = 250.
        //Jab 250 add kiya, totalExpenses = 250 hua.
        //Fir 500 add kiya, totalExpenses = 250 + 500 = 750 hua.
        //Fir 100 add kiya, totalExpenses = 750 + 100 = 850 hua.

        System.out.println("Expense added successfully!");

        if (totalExpenses > budget) {
            System.out.println("⚠ WARNING: You have exceeded your monthly budget!");
        } else if (totalExpenses >= 0.8 * budget) {
            System.out.println("⚠ ALERT: You have used 80% of your budget.");
        } else if (totalExpenses >= 0.5 * budget) {
            System.out.println("ℹ NOTICE: You have used 50% of your budget.");
        }
    }

    public void showExpenses() {
        if (expenseList.isEmpty()) {
            System.out.println("No expenses recorded!");
            return;
        }

        System.out.println("\n--- EXPENSE LIST ---");
        for (Expense e : expenseList) {
            System.out.println("Category: " + e.getCategory() +
                    ", Amount: " + e.getAmount() +
                    ", Note: " + e.getNote());
        }
        // e.getCategory() --> Expense object e se uski category ki value le lo
        System.out.println("---------------------");
    }

    public void showSummary() {
        System.out.println("\n--- MONTHLY SUMMARY ---");
        System.out.println("Total Budget: " + budget);
        System.out.println("Total Spent: " + totalExpenses);
        System.out.println("Remaining Budget: " + (budget - totalExpenses));
        System.out.println("------------------------");
    }
}



