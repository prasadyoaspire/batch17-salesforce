package day7;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
    
       HashMap<String,String>  map = new HashMap<>(); //unordered collection
       map.put("India", "NewDelhi");
       map.put("USA","Washington D.C");
       map.put("Russia", "Moscow");
       map.put("Japan","Tokyo");

       System.out.println(map);

       //how to get all keys inside map
        Set<String> keys =  map.keySet();

        System.out.println(keys);

        //how to all values inside map
        //todo


    }
}
