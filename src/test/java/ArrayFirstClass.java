public class ArrayFirstClass {
    public static void intType(){
        System.out.println("updated");
        int a[]=new int[5];
        a[0]=6;
        a[1]=8;
        a[2]=7;
        a[3]=9;
        a[4]=5;

        System.out.println("*******int type********");

        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("*******int type********");

    }
    public void stringType(){
        String b[]=new String[4];
        b[0]="mohammed";
        b[1]="shariar";
        b[2]="islam";
        b[3]="sharif";

        System.out.println("*******string type********");

        for (int i=0; i<4; i++){
            System.out.println(b[i]);
        }
        System.out.println("*******string type********");

    }
    public void withoutInitialize(){
        int c[]={10,20,12,25,50,45,30};
        System.out.println("**************without initialization");
       for( int i:c){
            System.out.println(i);
        }
        System.out.println("**************without initialization");
    }


    public static void main(String[] args) {
        ArrayFirstClass.intType();

        ArrayFirstClass arrayFirstClass= new ArrayFirstClass();
        arrayFirstClass.stringType();

        arrayFirstClass.withoutInitialize();





    }
}
