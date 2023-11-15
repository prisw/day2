package day2.src;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BankAccount {
    
    private String Holdername;
    private static String accountNumber;
    private static float accountBalance;
    private boolean closedAccount;
    private String creatingDate;
    private String closingDate;


    public String getName() {return Holdername;}
    public void setName(String Holdername) {this.Holdername = Holdername;}

    public String getAccountNumber() {return accountNumber;}
    public void setAccountNumber(String accountNumber) {BankAccount.accountNumber = accountNumber;}
    
    public float getAccountBalance() {return accountBalance;}
    public void setAccountBalance(float accountBalance) {this.accountBalance = accountBalance;}
    
    public boolean isClosedAccount() {return closedAccount;}
    public void setClosedAccount(boolean closedAccount) {this.closedAccount = closedAccount;}
    
    public List<Transaction> getTransactions() {return transactions;}
    
    private static List<Transaction> transactions = new ArrayList<>();
    public void addTransaction (List<String> Transactions){
        Transaction.add(Transactions);}

    public void removeTransaction(int index) {
        if(index >= 0 && index < Transaction.size()) {
            Transaction.remove(index); } }
    

    public String getCreatingDate() {return creatingDate;}
    public void setCreatingDate(String creatingDate) {this.creatingDate = creatingDate;}
    
    public String getClosingDate() {return closingDate;}
    public void setClosingDate(String closingDate) {this.closingDate = closingDate;}
    
    public BankAccount (String Holdername) {
        BankAccount.accountBalance = 0;
    }

    public BankAccount (String Holdername, float accountBalance) {
        BankAccount.accountBalance = 0;
    } 

    static Scanner scanner = new Scanner(System.in);

    //to view transcation list
    public static void TransactionList() {
        if(transactions.isEmpty()) {
            System.out.println("No transaction available");
        } else {
            System.out.println("Transactions made:");
            for (int i = 0; i < transactions.size(); i++) {
                System.out.println(i + 1 +". " + transactions.get(i));
            }
        }
    }


    //to deposit money
    public static void Deposit(){
        float amount;
        System.out.println("Enter the deposit amount: ");
        amount = scanner.nextInt();
        accountBalance = accountBalance + amount;
        java.util.Date date = new java.util.Date();
        System.out.println("deposit $" + amount + " at " + date);
        //transactions.add(amount);

//how to put the amount into the list?
    }

    public static void Withdraw() {
        System.out.println("Enter the withdrawal amount: ");
        float amount;
        amount = scanner.nextInt();
        if(accountBalance >= amount){
            accountBalance = accountBalance - amount;
            java.util.Date date = new java.util.Date();
            System.out.println("Withdraw $" + amount + " at " + date);
        } else {System.out.println("not enough balance");}
    }



        public static void main(String[] args) throws Exception{ 
            Scanner scanner = new Scanner(System.in);

            while(true) {
                System.out.println("Enter command: deposit, withdraw ,transaction list, exit");
                String command = scanner.nextLine().toLowerCase();
                switch (command) {
                    case "deposit":
                    Deposit();
                    break;

                    case "withdraw":
                    Withdraw();
                    break;

                    case "transaction list":
                    TransactionList();
                    break;

                    case "exit":
                    exit();

                    default:
                    System.out.println("Please enter the correct command");
                    break;
                    
                }




            }



}
        private static void exit() {
            scanner.close();
        }
    }
