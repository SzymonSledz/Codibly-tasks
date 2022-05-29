package org.example.balancedWordsTests;

import org.example.balancedWords.BalancedWordsCounter;
import org.example.TestConstants;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BalancedWordsCounterTest {

    BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

    @Test
    void shouldReturnCorrectNumber_whenGivenString() {
        //given
        String input = TestConstants.TEST_BALANCED_WORDS_COUNTER_WHEN_STRING;
        //when
        int result = balancedWordsCounter.count(input);
        //then
        assertEquals(28, result);
    }

    @Test
    void shouldReturnCorrectNumber_whenEmptyString() {
        //given
        String input = TestConstants.TEST_BALANCED_WORDS_COUNTER_WHEN_EMPTY_STRING;
        //when
        int result = balancedWordsCounter.count(input);
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldReturnRuntimeException_whenNumberInString() {
        //given

        //when
        Exception exception = assertThrows(RuntimeException.class, () -> {
            String input = TestConstants.TEST_BALANCED_WORDS_COUNTER_WHEN_NUMBER_IN_STRING;
            int result = balancedWordsCounter.count(input);});
        //then
        String result = exception.getMessage();
        assertTrue(result.contains(TestConstants.TEST_RUNTIME_EXCEPTION_MESSAGE_WHEN_NUMBER_IN_STRING_OR_NULL));
    }

    @Test
    void shouldReturnRuntimeException_whenNull() {
        //given

        //when
        Exception exception = assertThrows(RuntimeException.class, () -> {
            String input = null;
            int result = balancedWordsCounter.count(input);});
        //then
        String result = exception.getMessage();
        assertTrue(result.contains(TestConstants.TEST_RUNTIME_EXCEPTION_MESSAGE_WHEN_NUMBER_IN_STRING_OR_NULL));
    }
}
