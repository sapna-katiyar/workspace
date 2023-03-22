public class ReveresString {
    public static void main(String[] args) {
        String s = "Selenium";

        //Using For Loop
        int len = s.length();
        String rev="";
        for(int i=len-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        //Using StringBuffer Class

        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());
    }
}
