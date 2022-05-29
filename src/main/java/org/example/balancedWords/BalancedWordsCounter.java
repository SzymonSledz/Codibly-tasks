package org.example.balancedWords;

import java.util.HashMap;
import java.util.Map;

public class BalancedWordsCounter {

    public int count(String input) {
        int len;
        int numberOfBalancedWords = 0;

        if (input == null || !input.matches("[a-zA-Z]+") && input != "") throw new RuntimeException("Input should contain only letters nor be null");

        len = input.length();
        if (len == 0) return 0;
        else if (len == 1) return 1;

        //Add every substring of length 1 and 2
        numberOfBalancedWords += 2 * len - 1;

        for (int i = 2; i < len; i++) {
            Map<Character, Integer> map = getFirstIteration(input, i + 1);
            for (int j = i; j < len; j++) {
                if (checkIfWordIsBalanced(map)) numberOfBalancedWords++;

                if (map.get(input.charAt(j - i)) == 1) map.remove(input.charAt(j - i));
                else map.replace(input.charAt(j - i), map.get(input.charAt(j - i)) - 1);

                if (j + 1 < len)
                    map.put(input.charAt(j + 1), map.getOrDefault(input.charAt(j + 1), 0) + 1);
            }
        }
        return numberOfBalancedWords;
    }

    private Map<Character, Integer> getFirstIteration(String input, int n) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            map.put(input.charAt(i), map.containsKey(input.charAt(i)) ? map.get(input.charAt(i)) + 1 : 1);
        return map;
    }

    private boolean checkIfWordIsBalanced(Map<Character, Integer> map) {
        int firstValue = -1;
        for (Integer value : map.values()) {
            if (firstValue == -1) firstValue = value;
            else if (firstValue != value) return false;
        }
        return true;
    }
}
