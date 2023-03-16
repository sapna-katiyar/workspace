public class Abstraction {
    public static void main(String[] args) {
        ICICIBank ic = new ICICIBank();
        ic.carloan();
        ic.credit();
        ic.debit();
        ic.homeloan();
        ic.mutualfunds();

        USBank us = new ICICIBank();
        us.transfermoney();
        //Only USBank interface methodsa can be called since reference variable is of USBank interface only.
    }
}