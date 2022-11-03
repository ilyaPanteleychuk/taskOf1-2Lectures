package com.ilyapanteleychuk.course.task1.assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;


class DescendingSorterTest {
    
    private DescendingSorter descendingSorter;
    
    @BeforeEach
    void init(){
        descendingSorter = new DescendingSorter();
    }
    
    @Test
    void descendingSort_shouldSortArrayInDescendingOrder_whenElementsArePositive() {
        int[] expected = new int[]{10, 8, 7, 0};
        int[] actual = descendingSorter.descendingSort(new int[]{7, 8, 0, 10});
        System.out.println(Arrays.toString(actual));
        boolean isEquals = Arrays.equals(expected, actual);
        assertTrue(isEquals);
    }
    
    @Test
    void descendingSort_shouldRemoveNegativesAndSort_whenElementIsNegative() {
        int[] expected = new int[]{10, 8, 7, 0};
        int[] actual = descendingSorter
                .descendingSort(new int[]{7, 8, 0, 10, -1, -214, -222});
        System.out.println(Arrays.toString(actual));
        boolean isEquals = Arrays.equals(expected, actual);
        assertTrue(isEquals);
    }
}
