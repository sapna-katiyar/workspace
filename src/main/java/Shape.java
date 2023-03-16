public abstract class Shape {
    Shape(){
        System.out.println("Abstract class consturctor");
    }

    int color;
    abstract void drawing();
    public void fill(){

    }
    //Can create the consturctor on Abstract class.
}