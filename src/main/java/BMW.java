public class BMW extends Car {

    //when same method is present in parent class as well as in child class with same name and same no of
    // arguments, is called method-overriding.
            public void start(){ //Overridden method
                System.out.println("BMW-----------start");
            }
            public void theftSafety(){
                System.out.println("Theftsafty---------BMW");
             }

}