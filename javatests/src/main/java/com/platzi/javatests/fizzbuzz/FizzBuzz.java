package com.platzi.javatests.fizzbuzz;

public class FizzBuzz {
    public static String fizzBuzz(int n){
        String s = "";

        if(n % 3 ==0){
            s = s.concat("Fizz");
        }
        if (n % 5 == 0){
            s = s.concat("Buzz");
        }

        if (n % 3 !=0 && n % 5 != 0 )
            s = s.concat(String.valueOf(n));

        return s;

    }
}
