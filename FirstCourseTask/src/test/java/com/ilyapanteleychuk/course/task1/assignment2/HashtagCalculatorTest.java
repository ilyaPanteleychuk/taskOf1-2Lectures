package com.ilyapanteleychuk.course.task1.assignment2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;


class HashtagCalculatorTest {
    
    private HashtagCalculator hashtagCalculator;
    
    @BeforeEach
    void init(){
        hashtagCalculator = new HashtagCalculator();
    }
    
    @Test
    void countPopularHashTags_shouldReturnMostPopularHashtags_whenStringHasNoDuplicate() {
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("#world", 2);
        expected.put("#hello", 3);
        List<String> input = List.of("#Hello #World", "#Hello #World", "#Hello");
        Map<String, Integer> actual = hashtagCalculator.countPopularHashTags(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void countPopularHashTags_shouldSkipDuplicateHashtag_whenStringHasDuplicates() {
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("#world", 2);
        expected.put("#hello", 3);
        List<String> input = List.of("#Hello #World #World", "#Hello #World", "#Hello #Hello");
        Map<String, Integer> actual = hashtagCalculator.countPopularHashTags(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void countPopularHashTags_shouldSkipWordsWithoutLetter_whenNonAlphabeticWordsPresent() {
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("#hello", 3);
        expected.put("#world", 2);
        List<String> input = List.of("#Hello #World #World", "#Hello #### #World", "#Hello #Hello");
        Map<String, Integer> actual = hashtagCalculator.countPopularHashTags(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void countPopularHashTags_shouldShowOnlyFiveEntries() {
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("#mother", 4);
        expected.put("#brother", 4);
        expected.put("#father", 3);
        expected.put("#hello", 3);
        expected.put("#world", 2);
        List<String> input = List.of("#Skipped #Hello #Mother #Brother",
                "#Father #World #Mother #Brother",
                "#Father #Hello #Mother #Brother #World",
                "#Father #Mother #Hello #Brother", "Brother");
        Map<String, Integer> actual = hashtagCalculator.countPopularHashTags(input);
        assertEquals(expected, actual);
    }
}
