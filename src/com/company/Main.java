package com.company;

import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        HashMap<String, Integer> examResultHashMap = new HashMap<>();
        HashMap<Integer, List<Integer>> examResultHashMapList = new HashMap<>();

        examResultHashMapList.put("Student1", ListOf(10, 30, 60));
        System.out.println(examResultHashMapList);


        examResultHashMap.put("Student1", 10);
        examResultHashMap.put("Student2", 20);
        examResultHashMap.put("Student3", 30);
        examResultHashMap.put("Student4", 40);

        System.out.println("Size of hashMap is " + examResultHashMap.size());
        System.out.println(examResultHashMap);


        // check uf a key is present
        if (examResultHashMap.containsKey("Student1")){
            Integer examScore = examResultHashMap.get("Student1");
            System.out.println("Value for key is " + examScore);

            //change a student score
            examResultHashMap.put("Student4", 80);
            System.out.println(examResultHashMap);
        }
    }
}
