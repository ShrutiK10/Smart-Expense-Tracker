import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        // User se budget input lena
        System.out.print("Enter your monthly budget: ");
        double budget = sc.nextDouble();
        sc.nextLine();  // consume newline
        manager.setBudget(budget);  //manager object ke through setBudget method ko call kar rahi ho, aur usme budget value pass kar rahi ho.

        // Expense add karte raho until user stops
        while (true) {
            System.out.print("\nDo you want to add an expense? (yes/no): ");
            String choice = sc.nextLine().trim().toLowerCase();  //User jo likhega usko read karo aur Space hata do (trim()).
   // Aur lowercase mein convert kar do (toLowercase()),taaki "Yes", "YES", " yEs" sab "yes" ban jaye.

            if (!choice.equals("yes")) { //yes nhi bola oh loop ke bahar aa jao
                break;
            }

            System.out.print("Enter category: ");
            String category = sc.nextLine();  //Category ho sakti hai multi-word: "Online Shopping" ya "Travel Expense"
                                              //nextLine() entire sentence read kar leta hai

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();  // consume newline

            System.out.print("Enter note: ");
            String note = sc.nextLine();

            manager.addExpense(category, amount, note);  //Ye line tumhare expense ko save karne ke liye hai.
        }

        // Final expense list aur summary show karo
        manager.showExpenses();
        manager.showSummary();

        sc.close();
    }
}


