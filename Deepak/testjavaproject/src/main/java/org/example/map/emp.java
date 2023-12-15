package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class emp {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
         map.put(101,"Deepak");
        map.put(102,"Rahul");
        map.put(103,"Santosh");
        map.put(104,"Satish");
        map.put(105,"Anish");
        map.put(106,"Iqbal");
        map.put(107,"mahesh");
        System.out.println(map);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for ( Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }


    }
}
