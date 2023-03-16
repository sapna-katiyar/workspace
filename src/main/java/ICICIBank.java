public class ICICIBank implements RBI, USBank{

    @Override
    public void debit() {
        System.out.println("icici----------debit");
    }

    @Override
    public void credit() {
        System.out.println("icici----------credit");

    }

    @Override
    public void transfermoney() {
        System.out.println("icici----------transfermoney");

    }

    @Override
    public void educationloan() {
        System.out.println("icici----------educationloan");

    }

    @Override
    public void homeloan() {
        System.out.println("icici----------homeloan");

    }

    @Override
    public void carloan() {
        System.out.println("icici----------carloan");

    }

    //ICICI bank class methods:
    public  void  mutualfunds(){
        System.out.println("ICICI---mutual funds");
    }
    public void Insurance(){
        System.out.println("ICICI-----Insurance");

    }

}
