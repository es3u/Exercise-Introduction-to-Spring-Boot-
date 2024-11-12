package com.example.exercise_introductiontospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Exercise {

    @GetMapping("/name")
    public String name() {
        return "Essa Almutiri";
    }

    @GetMapping("/age")
    public int age() {
        return 25;
    }

    @GetMapping("/check/status")
    public String checkStatus() {
        return "Everything is OK";
    }

    @GetMapping("/health")
    public String health() {
        return " “Server health is up and running”";
    }


        int[] arr = new int[10];
        @GetMapping("/Array")
        public int[] getArr() {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i+1;
            }

//            for (int i = 0; i < arr.length; i++) {
//                 System.out.println(arr[i]);
//
//            }
            return arr;
        }

    String[] strArr = {"Essa","Obaid" , "ALmutiri" ,};
    @GetMapping("/strArr")
    public String[] getStrArr() {
        return strArr;
    }




}
