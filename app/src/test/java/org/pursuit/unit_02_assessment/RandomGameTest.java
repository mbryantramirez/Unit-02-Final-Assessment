package org.pursuit.unit_02_assessment;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RandomGameTest {
    private RandomGame randomGame;

    @Before
    public void setUp() {
        randomGame = new RandomGame();
    }



    // TODO: Initialize any test variables with object values in a "setUp()" method that runs before any of the unit tests.

    // TODO: Create a test method called "test_get_random_number_method()". Add logic to confirm that the number returned from the getRandomNumber() method is between 1 and 100, including both 1 and 100.

    @Test
    public void test_get_random_number_method() {
        int randomNumber = randomGame.getRandomNumber();

        assertTrue(String.valueOf(randomNumber), randomNumber >= 1);
        assertTrue(String.valueOf(randomNumber), randomNumber <= 100);
    }

    // TODO: Create a test method called "test_check_guess_method()". Add logic to confirm that the boolean value returned is true if the numbers passed to the checkGuess() method are equal, and false if they are not equal.

    @Test
    public void test_check_guess_method() {
        int randomNumber = randomGame.getRandomNumber();
        int guessedNumber = 28;

        assertTrue(String.valueOf(guessedNumber), randomNumber == guessedNumber);
        assertFalse(String.valueOf(guessedNumber), randomNumber != guessedNumber);
    }

    // TODO: Create a test method called "test_get_string_result()". Add logic to confirm that the String value returned from the getStringResult() method matches expected output based on what boolean value is passed to the parameter.

    @Test
    public void test_get_string_result() {
        assertThat(randomGame.getStringResult(true), is("You have guessed correctly!"));
        assertThat(randomGame.getStringResult(false), is("Wrong guess - please try again!"));
    }

    // TODO: Create a test method called "test_string_to_int()". Add logic to confirm that the method stringToInt() returns a valid integer value based on the String input provided.

    @Test
    public void test_string_to_int() {
        assertThat(randomGame.stringToInt("28"), is(28));
    }
}
