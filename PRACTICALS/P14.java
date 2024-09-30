//14. Write a java program to implement Interface using extends keyword.

interface Printable {
    void print();
}

interface Document extends Printable {
    void save();
}

class PDF implements Document {
    @Override
    public void print() {
        System.out.println("Printing a PDF document");
    }

    @Override
    public void save() {
        System.out.println("Saving a PDF document");
    }
}

public class P14 {
    public static void main(String[] args) {
        PDF pdf = new PDF();
        pdf.print();
        pdf.save();
    }
}
