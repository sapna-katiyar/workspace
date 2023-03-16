class Student{   //Encapsulation--> Binding data in methods
    private int rollno;
    private String name;
    public void setRollno(int r){
        rollno= r;
    }
    public int getRollno()
    {
        return rollno;
    }
    public void setName(String n)
    {
        name= n;
    }
    public String getName()
    {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

     {
        Student s1 = new Student();
        s1.setRollno(2);
        s1.setName("sapna");
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());

    }
    }
}
