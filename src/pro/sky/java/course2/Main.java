package pro.sky.java.course2;

import java.util.*;

public class Main {

    static List<Integer> nums = new ArrayList<>(List.of(78, 24, 24, 32, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static List<String> strings = new ArrayList<>(List.of("one", "two", "three", "four", "two", "three", "three"));

    public static void main(String[] args) {

        printOddNumbers(nums); //task 1
        printEvenSortedNumbersWoutDuplicates(nums);//task2
        printUniqueWords(strings);//task3
        printNumbersOfDuplicateWords(strings);//task4

    }

    //task1
    public static void printOddNumbers(List<Integer> listOfNumbers) {
        List<Integer> listOfOddNumbers = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 != 0) {
                listOfOddNumbers.add(listOfOddNumbers.size(), listOfNumbers.get(i));
            }
        }
        System.out.println(listOfOddNumbers);
    }

    //task2
    public static void printEvenSortedNumbersWoutDuplicates(List<Integer> listOfNumbers) {
        List<Integer> listOfEvenNumbers = new ArrayList<>();
        List<Integer> listOfEvenNumbersWoutDuplicates = new ArrayList<>();

        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 == 0) {
                listOfEvenNumbers.add(listOfNumbers.get(i));
            }
        }

        for (int i = 0; i < listOfEvenNumbers.size(); i++) {
            if (!listOfEvenNumbersWoutDuplicates.contains(listOfEvenNumbers.get(i))) {
                listOfEvenNumbersWoutDuplicates.add(listOfEvenNumbers.get(i));
            }
        }
        listOfEvenNumbersWoutDuplicates.sort(Comparator.naturalOrder());
        System.out.println(listOfEvenNumbersWoutDuplicates);
    }

    //task3
    public static void printUniqueWords(List<String> listOfStrings) {
        Set<String> listOfUniqueWords = new HashSet<>(listOfStrings);
        System.out.println(listOfUniqueWords);
    }

    //task4
    public static void printNumbersOfDuplicateWords(List<String> listOfStrings) {
        int count = 0;
        for (int i = 0; i < listOfStrings.size(); i++) {
            count = Collections.frequency(listOfStrings, listOfStrings.get(i));
        }
        System.out.println(count);
    }
}
