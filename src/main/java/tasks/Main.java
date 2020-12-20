package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final Integer LIST_LENGTH = 5;

    public static void main(String[] args) {
        // Task 1
        List<String> stringList = new ArrayList<>();
        stringList.add("hello!!!");
        for (int i = 0; i < LIST_LENGTH; i++) {
            stringList.add(Integer.toString(i));
        }
        System.out.println("Mapping result: " + MapTask.mapping(stringList));

        // Task 2
        stringList = Arrays.asList("hello", "world!");
        System.out.println("Flatting result: " + FlattingTask.flattingStrings(stringList));

        // Task 3
        System.out.println("FizzBuzz result: " + FizzBuzzTask.fizzBuzzIt(25));

        // Task 4
        stringList = Arrays.asList("hello", "world!", "I", "am", "happyh", "iaaa");
        // Group all the words by their first letter
        System.out.println("GroupWords result: " + GroupWordsTask.getGroupedWords(stringList));
        // Summarize the counts and combine them with character that represents a group
        System.out.println("GroupWords result: " + GroupWordsTask.groupIt(stringList));
    }
}
