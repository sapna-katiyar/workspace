public class ReveresInteger {
    public static void main(String[] args) {

        //Using Algo
        long num = 973683;
        long rev = 0;
        while(num !=0){
            rev=rev*10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);

        //using StringBuffer
        long num1 = 896476;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}
