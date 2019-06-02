package assertjdemo.string_utils;

import demo.StringUtils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("String utils test")
class StringUtilsTest {

    @Test
    @DisplayName("Valid palindrome test")
    void testValidPalindrome() {
        String validPalindrome = "level";
        assertThat(StringUtils.isPalindrome(validPalindrome)).isTrue();
    }

    @Test
    @DisplayName("Invalid palindrome test")
    void testInvalidPalindrome() {
        String validPalindrome = "leveel";
        assertThat(StringUtils.isPalindrome(validPalindrome)).isFalse();
    }

    @Test
    @DisplayName("Valid russian palindrome test")
    @Disabled("Для русских слов не работает валидно")
    void testRussianValidPalindrome() {
        String validPalindrome = "потоп";
        assertThat(StringUtils.isPalindrome(validPalindrome)).isTrue();
    }
}
