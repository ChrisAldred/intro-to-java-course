package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FlowControlExercises {

    public void fizzBuzzPrint(List<Integer> numbers){
    
        for(int i = 0; i < numbers.size(); i = i + 1){

            Integer number = numbers.get(i);

            if(number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list

        List<String> stringList = new ArrayList<>();

        for(int i = 0; i < numbers.size(); i = i + 1){

            Integer number = numbers.get(i);

            if(number % 3 == 0 && number % 5 == 0) {
                stringList.add("FizzBuzz");
            } else if (number % 3 == 0) {
                stringList.add("Fizz");
            } else if (number % 5 == 0) {
                stringList.add("Buzz");
            } else {
                stringList.add(number.toString());
            }
        }

        return stringList;
    }

    public String whichMonth(Integer number) {
    
        String month = "";

        switch (number){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid month number";
                break;
        }
        return month;
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}

        IntStream numbers = IntStream.range(1, 101);
        IntPredicate evenCheck = (int i) -> {
            return i % 2 == 0;
        };
        int sumOfEvens = numbers.filter(evenCheck).sum();

        IntPredicate oddCheck = i -> i % 2 != 0;
        numbers = IntStream.range(1, 101);
        int sumOfOdds = numbers.filter(oddCheck).sum();
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("SumOfEvens", sumOfEvens);
        map.put("SumOfOdds", sumOfOdds);

        return map;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        Collections.reverse(numbers);
        return numbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
