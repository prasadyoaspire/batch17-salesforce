package day7;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
       // HashMap<String,String>  map = new HashMap<>(); //unordered collection
       //LinkedHashMap<String,String> map = new LinkedHashMap<>(); //ordered collection
        TreeMap<String,String> map = new TreeMap<>(); //sorted
        map.put("India", "NewDelhi");
        map.put("USA","Washington D.C");
        map.put("Russia", "Moscow");
        map.put("Japan","Tokyo");

        System.out.println(map);

        String countryName = "Japan";

       String capital = map.get(countryName);
       if(capital != null) {
        System.out.println(capital);
       }
       else {
        System.out.println("no such element");
       }
       

    }
}
