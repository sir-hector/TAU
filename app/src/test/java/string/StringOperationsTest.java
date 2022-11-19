package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class StringOperationsTest {

    public StringOperations stringOperations;

    @BeforeEach
    void setUp() {
        stringOperations = new StringOperations();
    }

    @AfterEach
    void tearDown() {
        stringOperations = null;
    }

    @Test
    @DisplayName("Test reverse method - simple word")
    void testReverseSimpleWord() {
        assertEquals("cba",stringOperations.reverse("abc"));
    }

    @Test
    @DisplayName("Test reverse method - sentence")
    void TestReverseSentence() {
        assertEquals("atok am alA",stringOperations.reverse("Ala ma kota"));
    }

    @Test
    @DisplayName("Test reverse method - sentence")
    void TestReverseSentenceFail() {
        assertNotEquals("atok am al",stringOperations.reverse("Ala ma kota"));
    }

    @Test
    @DisplayName("Test Contact method")
    void TestContactMethod() {
        assertEquals("kotala",stringOperations.concat("kot", "ala"));
    }

    @Test
    @DisplayName("Test Contact method")
    void TestContactMethodFail() {
        assertNotEquals("kotalaa",stringOperations.concat("kot", "ala"));
    }

    @Test
    @DisplayName("Test Contact method with space")
    void TestContactMethodWithSpace() {
        assertEquals("kot ala",stringOperations.concat("kot ", "ala"));
    }

    @Test
    @DisplayName("Test Palindrome method")
    void TestIsPaLindrome() {
        assertTrue(stringOperations.isPalindrome("abba"));
    }

    @Test
    @DisplayName("Test Palindrome method")
    void TestIsPaLindromeFail() {
        assertFalse(stringOperations.isPalindrome("abbac"));
    }

    @Test
    @DisplayName("Test Palindrome sigle letter")
    void TestIsPaLindromeSingleLetter() {
        assertTrue(stringOperations.isPalindrome("a"));
    }

    @Test
    @DisplayName("Test Palindrome method with number")
    void TestIsPaLindromeWithNumber() {
        assertTrue(stringOperations.isPalindrome("15551"));
    }
}
