public class StringReverse {
    public static void stRev(String a) {
            StringBuilder sb = new StringBuilder(a);
            sb.reverse();
            System.out.println(sb);
        }

    public static void main(String[] args) {
        StringReverse.stRev("sharif");
    }


}
