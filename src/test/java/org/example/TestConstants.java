package org.example;

import java.util.*;

public class TestConstants {

    public static final ArrayList<Integer> TEST_INTEGERS_LIST = setupListOfIntegers();
    public static final ArrayList<Double> TEST_DOUBLE_LIST = setupListOfDouble();
    public static final ArrayList<Double> TEST_DOUBLE_LIST_WITH_NULL = setupListOfDoubleWithNull();
    public static final ArrayList<Integer> TEST_EMPTY_LIST = new ArrayList<>();
    public static final ArrayList<Integer> TEST_NULL_LIST = null;
    public static final String TEST_RUNTIME_EXCEPTION_MESSAGE_WHEN_NULL_LIST = "Input list is null";
    public static final String TEST_BALANCED_WORDS_COUNTER_WHEN_STRING = "aabbabcccba";
    public static final String TEST_BALANCED_WORDS_COUNTER_WHEN_EMPTY_STRING = "";
    public static final String TEST_BALANCED_WORDS_COUNTER_WHEN_NUMBER_IN_STRING = "abababa1";
    public static final String TEST_RUNTIME_EXCEPTION_MESSAGE_WHEN_NUMBER_IN_STRING_OR_NULL = "Input should contain only letters nor be null";


    private static ArrayList<Integer> setupListOfIntegers() {
        Integer[] array = {1,3,4,5,6,8,8};
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    private static ArrayList<Double> setupListOfDouble() {
        Double[] array = {-9.3,0.1,0.2,4.,5.,9.};
        ArrayList<Double> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    private static ArrayList<Double> setupListOfDoubleWithNull() {
        Double[] array = {5.0001};
        ArrayList<Double> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

}
