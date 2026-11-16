package day94;

import java.util.HashMap;

public class HM {
    static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        //insert o(1)

        hm.put("pakistan",10);
        hm.put("Malysia",90);
        hm.put("saudi arabia", 900);

        System.out.println(hm.size());

        System.out.println(hm.containsKey("pakistan"));
        System.out.println(hm.containsValue(900));

        System.out.println(hm.remove("Malysia"));
        System.out.println(hm);


//        System.out.println(hm);


//        iterate on hashmap using for each loop

        for(String key : hm.keySet()){
            System.out.print(key + " ");
            System.out.println(hm.get(key));
        }



    }

}
