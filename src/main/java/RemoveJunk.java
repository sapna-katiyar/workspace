public class RemoveJunk {
    public static void main(String[] args) {
        String s = "^%^%&^* lating string 072457";
        String s1 = "^%&^gyfi&%^bwif b&^*&48274 687^%^%&";
        //regular Expression [^a-zA-Z0-9]
        s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
        s1 = s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);
    }
}
