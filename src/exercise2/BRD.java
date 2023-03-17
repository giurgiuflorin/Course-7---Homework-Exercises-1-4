package exercise2;

public class BRD implements Bank{
    //Banca BRD percepe comisioane procentuale de retragere.
    //A se vedea tarifele in functia withdrawMoney.

    private double bankAccountBalance;
    private double requestedAmount;

    private double depositAmount;
   private double fee;

    @Override
    public double withdrawMoney(double requestedAmount) {
        if (requestedAmount > bankAccountBalance) {
            System.out.println("Not enough money! Your balance is $" + bankAccountBalance);
        }
        if (requestedAmount > 100000) {
            System.out.println("For such large amounts please contact the bank!");
        }
        if (requestedAmount < 1000){
            fee = requestedAmount * 0.012;
        }
        if (requestedAmount > 1000 && requestedAmount < 10000) {
            fee = requestedAmount * 0.034;
        }
        bankAccountBalance -= (requestedAmount + fee);
        System.out.println("You withdraw $" + requestedAmount);
        System.out.println("Value of fee is $" + fee);
        System.out.println("Your new balance is $" + bankAccountBalance);
        return bankAccountBalance;
    }

    @Override
    public double depositMoney(double depositAmount) {
        if (depositAmount < 0) {
            System.out.println("Please enter a positive number!");
        }
        bankAccountBalance += depositAmount;
        System.out.println("You deposited $" + depositAmount);
        System.out.println("Your new balance is $" + bankAccountBalance);
        return bankAccountBalance;
    }
}
