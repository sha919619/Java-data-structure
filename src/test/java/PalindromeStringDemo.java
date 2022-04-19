public class PalindromeStringDemo {
    public static void main(String[] args) {
        String rvrs="";

        String orgString="konok";
        int lngth=orgString.length();
        for (int i=lngth-1; i>=0; i--){
           rvrs=rvrs+orgString.charAt(i);
        }
        System.out.println(rvrs);
        if (orgString.equals(rvrs))
            System.out.println("This is a palindrome");
        else
            System.out.println("This isn't palindrome");
    }
}
