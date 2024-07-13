import java.util.Scanner;

public class Bank {

    String name;
    String email;
    int phone;
    float balance;
    String accountType;
    int accountNumber;
    int ifscCode;
    static String branchName="New York City";

    public Bank (String name, String email, int phone, float balance, String accountType, int accountNumber, int ifscCode){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }



    public void createAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println("Enter your email : ");
        String email = sc.next();
        System.out.println("Enter your phone number : ");
        int phone = sc.nextInt();
        System.out.println("Enter your initial balance : ");
        float balance = sc.nextFloat();
        System.out.println("Choose your account type: \n"+
                            "1. Current \n"+
                            "2. Saving \n");

        int choice;
        choice = sc.nextInt();
        if(choice == 1){
            accountType = "Current";
        }else if(choice == 2){
            accountType = "Saving";
        }
        accountNumber = 123456789;
        ifscCode = 123456;
        Bank newUser = new Bank(name, email, phone, balance, accountType,accountNumber,ifscCode);
        System.out.println("Account created successfully!");


    }

    public void displayAccount(){

        System.out.println("Account details:");
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Balance: " + this.balance);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("IFSC Code: " + this.ifscCode);
        System.out.println("Branch : " + Bank.branchName);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
