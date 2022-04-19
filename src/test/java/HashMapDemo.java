import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer,String>map=new HashMap<Integer,String>();

        map.put(001,"Mohammed");
        map.put(002,"Shariar");
        map.put(003,"Islam");
        map.put(004,"Sharif");

        System.out.println(map.size());
        System.out.println(map.isEmpty());

        for (Map.Entry<Integer,String> i:map.entrySet()){
            System.out.println(i.getKey() + " = " + i.getValue());

        }

    }
}
