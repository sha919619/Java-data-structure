import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list1= new ArrayList<Integer>();

        list1.add(50);
        list1.add(55);
        list1.add(50);
        list1.add(70);
        list1.add(65);
        list1.remove(3);
        //list1.clear();

        System.out.println("list1 size is: " + list1.size());

        for (int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }


        ArrayList<String> list2=new ArrayList<String>();

        list2.add("Mohammed");
        list2.add("Shariar");
        list2.add("Sharif");
        list2.add("Mohammed");
        list2.add("MOHAMMED");
        list2.add("mohammed");

        System.out.println("******************");
        System.out.println("list2 size is: " + list2.size());

        Iterator itr1=list2.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }

        System.out.println("*************");
        System.out.println("with for loop");

        for (String x:list2 ){
            System.out.println(x);
        }




    }
}
