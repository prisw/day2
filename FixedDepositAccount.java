package day2.src;

public class FixedDepositAccount extends BankAccount {

    private static Float interest;
    private static int duration;


    public FixedDepositAccount (String Holdername, Float accountBalance) {
        super(Holdername,accountBalance);}

    public FixedDepositAccount (String Holdername, Float accountBalance,Float interest) {
            FixedDepositAccount.interest = interest;}
    
    public FixedDepositAccount (String Holdername, Float accountBalance, Float interest, int duration) {
        FixedDepositAccount.duration = duration;
    }
}
