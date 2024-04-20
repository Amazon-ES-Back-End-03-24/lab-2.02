package org.example.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KeywordAnalyzerTest {

    @Test
    void containsReservedKeyword_emptyString_returnsFalse() {
        // this is the same: assertEquals(false, KeywordAnalyzer.containsReservedKeyword(""));
        assertFalse(KeywordAnalyzer.containsReservedKeyword(""));
    }

    @Test
    void containsReservedKeyword_null_returnsFalse() {
        assertFalse(KeywordAnalyzer.containsReservedKeyword(null));
    }

    @Test
    void containsReservedKeyword_String_returnsFalse() {
        assertFalse(KeywordAnalyzer.containsReservedKeyword("No reserved keywords here my friend"));
        assertFalse(KeywordAnalyzer.containsReservedKeyword("I love to breakdance"));
    }

    @Test
    void containsReservedKeyword_String_returnsTrue() {
        assertTrue(KeywordAnalyzer.containsReservedKeyword("Don't break my heart"));
    }

    @Test
    void containsReservedKeyword_findsFirstWord_returnsTrue() {
        // this is the same: assertEquals(true, KeywordAnalyzer.containsReservedKeyword("abstract methods are funny"));
        assertTrue(KeywordAnalyzer.containsReservedKeyword("abstract methods are funny"));
        assertTrue(KeywordAnalyzer.containsReservedKeyword(" methods are funny abstract"));
    }

    @Test
    void containsReservedKeyword_findsLastWord_returnsTrue() {
        assertTrue(KeywordAnalyzer.containsReservedKeyword("while I wait..."));
        assertTrue(KeywordAnalyzer.containsReservedKeyword("I wait...while"));
    }

    @Test
    void containsReservedKeyword_lowerCaseUpperCase_returnsTrue() {
        assertTrue(KeywordAnalyzer.containsReservedKeyword("While I wait..."));
        assertTrue(KeywordAnalyzer.containsReservedKeyword("I wait...ABStract"));
    }
}