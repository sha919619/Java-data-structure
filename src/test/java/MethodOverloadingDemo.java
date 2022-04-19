public class MethodOverloadingDemo {
    public static void sum(){
        System.out.println("This is method overloading");
    }
    public static void sum(int a){
        System.out.println(a+a);
    }
    public static void sum(int a, int b){
        System.out.println(a-b);
    }
    public static void sum(int a, double b){
        System.out.println(a*b);
    }
    public static void sum(int a, float b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo.sum();
        MethodOverloadingDemo.sum(50);
        MethodOverloadingDemo.sum(60,20);
        MethodOverloadingDemo.sum(10,2.5);
        MethodOverloadingDemo.sum(30,10.5f);
    }
}
