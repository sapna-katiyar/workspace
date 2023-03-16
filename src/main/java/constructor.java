public class constructor {

    String name;
    String sur;

    public constructor(){
        this("Mrs.");
    }

    public constructor (String a)
    {
        this(a,"Katiyar");

    }
    public constructor(String a, String b)
    {
        this.name = a;
        this.sur = b;

    }

    public static void main(String[] args) {
        constructor c = new constructor("sapna");
        System.out.println("my name is "+ c.name + " " +  c.sur);
    }


}
