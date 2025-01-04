package com.java2bigdata.corejava.collection;

import java.util.Map;
import java.util.HashMap;
public class MapLearning {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        //The entrySet() method returns a set of all the key-value pairs in the Map. Each element in the set is a Map.Entry object, which has methods to get the key and value

        for (Map.Entry<String,Integer> ent : map.entrySet() ) {
            System.out.println("key "+ ent.getKey()+"            value="+ent.getValue());
        }
        
           //The keySet() method returns a set of all the keys in the Map. You can then use each key to get its corresponding value.

        for (String key:map.keySet()
             ) {
            System.out.println(" keyset key ="+ key +"     value="+map.get(key));
        }

        //The values() method returns a collection of all the values in the Map. This is useful if you only need the values and not the keys.

        for (Integer in:map.values()
             ) {
            System.out.println( "value "+in);
        }

        //java8 foreach

        map.forEach((key ,value) ->
            System.out.println("foreach j8 key "+key+"          value=" +value)
        );
    }
}
