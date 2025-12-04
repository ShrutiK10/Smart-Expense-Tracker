public class Expense {

    //private isliye use kiya hai taaki doosri class isko access naa krr paye
    //Encapsulation ka use kiya hai

    private String category;
    private double amount;
    private String note;

    //Tum keh rahe ho: "Mujhe ek kharcha banana hai jisme category 'Food', amount 250, aur note 'Pizza party' ho
    //Toh ye constructor us kharche ki sari details ek hi jagah set kar deta hai, taaki baad mein tumko alag se set karne ki zarurat na pade.

    public Expense(String category, double amount, String note) {
        this.category = category;
        this.amount = amount;
        this.note = note;
    }

    //agar mujhe kisi dusri class se category ki value chahiye, toh hum getter method ka use karte h.
    //Ye method return karta hai category ki value.
    //getter-setter ke through zarurat padne par access deti ho.
    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getNote() {
        return note;
    }
}

