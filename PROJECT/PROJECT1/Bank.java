import java.util.Scanner;

public class Bank {
    int maxCustomer=100;
    Bank [] accounts = new Bank[maxCustomer];
    int accountCount = 0;

    String name;
    String email;
    int phone;
    double balance;
    String accountType;
    int accountNumber;
    String ifscCode;
    static String branchName="New York City";

    public int generateAccountNumber(){
        int accountNumber = (int)(Math.random()*1000000);
        return accountNumber;
    }
    
    public String generateIFSC(){
        String ifscCode = "IFSC"+(int)(Math.random()*1000000);
        return ifscCode;
    }

    public Bank (String name, String email, int phone, double balance, String accountType, int accountNumber, String ifscCode){
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
        double balance = sc.nextFloat();
        System.out.println("Choose your account type: \n"+
                            "1. Current \n"+
                            "2. Saving \n");

        int choice=1;
        while (true) {
            choice = sc.nextInt();
            if (choice == 1) {
                accountType = "Current";
                break;
            } else if (choice == 2) {
                accountType = "Saving";
                break;
            } else {
                System.out.println("Invalid choice. Please choose again: ");
            }
        }

        accountNumber = generateAccountNumber();
        ifscCode = generateIFSC();

        Bank newUser = new Bank(name, email, phone, balance, accountType,accountNumber,ifscCode);
        accounts[accountCount++] = newUser;
        System.out.println("Account created successfully!");


    }
    public void deleteAccount(int number){
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber == number) {
                for (int j = i; j < accountCount - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accountCount--;
                System.out.println("Account deleted successfully!");
                return;
            }
        }
        System.out.println("Account not found!");
    }

    public void displayAccount(int number){

        if(number == this.accountNumber){
            System.out.println("Account details:");
            System.out.println("Name: " + this.name);
            System.out.println("Email: " + this.email);
            System.out.println("Phone: " + this.phone);
            System.out.println("Balance: " + this.balance);
            System.out.println("Account Type: " + this.accountType);
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("IFSC Code: " + this.ifscCode);
            System.out.println("Branch : " + Bank.branchName);
        }else
        System.out.println("Invalid account number");
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Bank bank = new Bank("", "", 0, 0, "",0,"");
        while(true){
            System.out.println("Welcome to MANAMIRA bank\n"+
                "Enter your choice: \t"+
                "1. Create account\t"+
                "2. Delete account\t"+
                "3. Display account\t"+
                "4. Exit\n");
                choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    bank.createAccount();
                    break;
                case 2:
                    System.out.println("Enter account number to delete: ");
                    int deleteNumber = sc.nextInt();
                    bank.deleteAccount(deleteNumber);
                    break;
                case 3:
                    System.out.println("Enter account number to display: ");
                    int displayNumber = sc.nextInt();
                    bank.displayAccount(displayNumber);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }

        }
        }

        
    }

