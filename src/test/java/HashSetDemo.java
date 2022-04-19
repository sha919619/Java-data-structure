import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Integer> set1= new HashSet<>();

        set1.add(50);
        set1.add(55);
        set1.add(50);
        set1.add(70);
        set1.add(65);
        //set1.remove(1);
        //set1.clear();

        System.out.println("list1 size is: " + set1.size());

        for (int i:set1){
            System.out.println(i);
        }


        HashSet<String> set2=new HashSet<String>();

        set2.add("Mohammed");
        set2.add("Shariar");
        set2.add("Sharif");
        set2.add("Mohammed");
        set2.add("MOHAMMED");
        set2.add("mohammed");

        System.out.println("******************");
        System.out.println("list2 size is: " + set2.size());

        Iterator itr=set2.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
