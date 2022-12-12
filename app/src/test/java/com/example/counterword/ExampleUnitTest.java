package com.example.counterword;

import org.junit.Test;

import static org.junit.Assert.*;

import utils.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    //-------------Testing characters count-------------//
    @Test
    public void Test01GetCharsCount() {
        String stringInput = "abc";

        int expectedValue = 3;
        int actualValue = Integer.parseInt(TextCounter.getCharsCount(stringInput));

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void Test02GetCharsCount() {
        String stringInput = " abc ";

        int expectedValue = 5;
        int actualValue = Integer.parseInt(TextCounter.getCharsCount(stringInput));

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void Test03GetCharsCount() {
        String stringInput = " ";

        int expectedValue = 1;
        int actualValue = Integer.parseInt(TextCounter.getCharsCount(stringInput));

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void Test04GetCharsCount() {
        String stringInput = "";

        int expectedValue = 0;
        int actualValue = Integer.parseInt(TextCounter.getCharsCount(stringInput));

        assertEquals(expectedValue, actualValue);

    }

    @Test (expected = NullPointerException.class)
    public void Test05GetCharsCount() {
        String stringInput = null;
        TextCounter.getCharsCount(stringInput);
    }

    //-------------End of testing characters count-------------//


    //-------------Testing words count-------------//
    @Test
    public void Test01GetWordsCount() {
        String stringInput = "abc";

        int expectedValue = 1;
        int actualValue = TextCounter.getWordsCount(stringInput);

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void Test02GetWordsCount() {
        String stringInput = " abc ";

        int expectedValue = 1;
        int actualValue = TextCounter.getWordsCount(stringInput);

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void Test03GetWordsCount() {
        String stringInput = "     ";

        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(stringInput);

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void Test04GetWordsCount() {
        String stringInput = "";

        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(stringInput);

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void Test05GetWordsCount() {
        String stringInput = "abc.def,ghi";

        int expectedValue = 3;
        int actualValue = TextCounter.getWordsCount(stringInput);

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void Test06GetWordsCount() {
        String stringInput = " . , ";

        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(stringInput);

        assertEquals(expectedValue, actualValue);

    }

    //-------------End of testing words count-------------//

}