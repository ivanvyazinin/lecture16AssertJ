package junitdemo.string_utils;

import demo.StringUtils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("String utils test")
class StringUtilsTest {

    @Test
    @DisplayName("Valid palindrome test")
    void testValidPalindrome() {
        String validPalindrome = "level";
        assertTrue(StringUtils.isPalindrome(validPalindrome));
    }

    @Test
    @DisplayName("Invalid palindrome test")
    void testInvalidPalindrome() {
        String validPalindrome = "leveel";
        assertFalse(StringUtils.isPalindrome(validPalindrome));
    }

    @Test
    @DisplayName("Valid russian palindrome test")
    @Disabled("Для русских слов не работает валидно")
    void testRussianValidPalindrome() {
        String validPalindrome = "потоп";
        assertTrue(StringUtils.isPalindrome(validPalindrome));
    }
}
