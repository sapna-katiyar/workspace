import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestAndLargestNumber {
    public static void main(String[] args) {
        int numbers[]={-10,12,23,5,4,70};
        int largest=numbers[0];
        int smallest=numbers[0];
        for(int i=1; i< numbers.length; i++){
        if(numbers[i]>largest){
            largest=numbers[i];
        }
        else if(numbers[i]<smallest){
            smallest=numbers[i];
        }
        }
        System.out.println("\n given array is" + Arrays.toString(numbers));
        System.out.println("Largest Number is" + largest);
        System.out.println("Smallest Number is" + smallest);
    }
}
