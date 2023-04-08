import java .util.*;

public class practice10 {

    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();

        map.put("india",120);
        map.put("china", 100);
        map.put("italy",20);

        // System.out.println(map);

        // if(map.containsKey("italy")){
        //     System.out.println("key present");
        // }
        // else{
        //     System.out.println("key not present");
        // }


        // System.out.println(map.get("india"));
        // System.out.println(map.get("africa"));


        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        
    }
    
}
