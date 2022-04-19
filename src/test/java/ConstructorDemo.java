public class ConstructorDemo {
    public ConstructorDemo(){
        System.out.println("This is Constructor");
    }
    public ConstructorDemo(int a){
        System.out.println(a+a);
    }
    public ConstructorDemo(int a, int b){
        System.out.println(a-b);
    }
    public ConstructorDemo(int a, String b){
        System.out.println("This is Constructor overloading");
    }
    public ConstructorDemo(String a, String b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        ConstructorDemo con=new ConstructorDemo();
        con=new ConstructorDemo(50);
        con=new ConstructorDemo(70, 40);
        con=new ConstructorDemo(001, "Hi");
        con=new ConstructorDemo("This is ", " Sharif");
    }
}
