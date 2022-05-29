package org.example.sort;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BubbleSort {

    public List<? extends Comparable> sort(List<? extends Comparable> input) {
        //If null list - throw runtime exception
        if (input == null) throw new RuntimeException("Input list is null");

        //Remove all null values in list
        input = input.stream().filter(Objects::nonNull).collect(Collectors.toList());

        int sizeOfList = input.size();

        //Bubble sort
        for (int i = 0; i < sizeOfList - 1; i++) {
            for (int j = 0; j < sizeOfList - i - 1; j++) {
                if (input.get(j) == null || input.get(j + 1) == null || i == j) continue;
                if (input.get(j).compareTo(input.get(j + 1)) > 0) Collections.swap(input, j, j+1);
            }
        }
        return input;
    }
}
