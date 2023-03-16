import com.sun.jdi.PathSearchingVirtualMachine;

import java.security.PublicKey;

    public class MethodOverloading {
        public static void main(String[] args) {
            MethodOverloading m = new MethodOverloading();
            m.sum(5);
    }

    /*when the method name is same with different arguments or input parameters within
      the same class-> Method overloading*/
    public void sum() { //zero input parameter
        System.out.println("Sum method --zero parameters");

    }
    public void sum(int i) { //1 input parameter
    System.out.println("Sum method --1 input parameter");
        System.out.println(i);
    }
    public void sum(int i, int j) { //2 input parameter
            System.out.println("Sum method --1 input parameter");
    }
}
