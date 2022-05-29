package org.example.sortTests;

import org.example.TestConstants;
import org.example.sort.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    void shouldReturnSortedList_whenListOfIntegers() {
        //given
        ArrayList<Integer> actual = TestConstants.TEST_INTEGERS_LIST;
        Integer[] array = {1,4,5,6,8,3,8};
        ArrayList<Integer> result = new ArrayList<>();
        Collections.addAll(result, array);
        //when
        result = (ArrayList<Integer>) bubbleSort.sort(result);
        //then
        assertEquals(actual, result);
    }

    @Test
    void shouldReturnSortedList_whenListOfDouble() {
        //given
        ArrayList<Double> actual = TestConstants.TEST_DOUBLE_LIST;
        Double[] array = {-9.3,0.2,4.,0.1,5.,9.};
        ArrayList<Double> result = new ArrayList<>();
        Collections.addAll(result, array);
        //when
        result = (ArrayList<Double>) bubbleSort.sort(result);
        //then
        assertEquals(actual, result);
    }

    @Test
    void shouldReturnEmptyList_whenEmptyList() {
        //given
        ArrayList<Integer> actual = TestConstants.TEST_EMPTY_LIST;
        ArrayList<Integer> result = new ArrayList<>();
        //when
        result = (ArrayList<Integer>) bubbleSort.sort(result);
        //then
        assertEquals(actual, result);
    }

    @Test
    void shouldOmitNull_whenNullInList() {
        //given
        ArrayList<Double> actual = TestConstants.TEST_DOUBLE_LIST_WITH_NULL;
        Double[] array = {null,5.0001};
        ArrayList<Double> result = new ArrayList<>();
        Collections.addAll(result, array);
        //when
        result = (ArrayList<Double>) bubbleSort.sort(result);
        //then
        assertEquals(actual, result);
    }

    @Test
    void shouldThrowRuntimeException_whenNullList() {
        //given

        //when
        Exception exception = assertThrows(RuntimeException.class, () -> {
            ArrayList<Integer> resultList = TestConstants.TEST_NULL_LIST;
            resultList = (ArrayList<Integer>) bubbleSort.sort(resultList);});
        //then
        String result = exception.getMessage();
        assertTrue(result.contains(TestConstants.TEST_RUNTIME_EXCEPTION_MESSAGE_WHEN_NULL_LIST));
    }
}
