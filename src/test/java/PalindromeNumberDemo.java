public class PalindromeNumberDemo {
    public static void main(String[] args) {
        int rv=0, temp;
        int OrgNumber=3575;
        temp=OrgNumber;
        while (OrgNumber>0){
            rv=(rv*10)+(OrgNumber%10);
            OrgNumber=OrgNumber/10;
        }
        System.out.println(rv);
        if (temp==rv)
            System.out.println("This is a palindrome Number");
        else
            System.out.println("This isn't palindrome number");
    }
}
