import java.util.*;

public class HashSets {
    public static void main(String[] args){
        HashSet<Integer> set= new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        // if(set.contains(1)){
        //     System.out.println("set contains 1");
        // }
        // if(!set.contains(6)){
        //     System.out.println("set does not contains");
        // }

        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("does not contains");
        // }


        // System.out.println(set.size());

        // System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }







    }

    
}
