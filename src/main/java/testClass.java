public class testClass {
    public static void main(String[] args) {
        //static polymorphism or compile time polymorphism
        BMW b = new BMW();
        b.start();
        b.stop();
        b.refuel();
        b.theftSafety();
        System.out.println("**********");
        Car c = new Car();
        c.start();
        c.refuel();
        System.out.println("**********");
        Car c1 = new BMW(); //child class object can be referred by parent class reference variable
                            //Dynamic polymorphism--> Run time polymorphism
        c1.start();
        c1.stop();
        c1.refuel();
    }
}
