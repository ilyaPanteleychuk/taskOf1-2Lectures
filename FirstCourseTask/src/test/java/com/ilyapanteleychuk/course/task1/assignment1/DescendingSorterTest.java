package com.ilyapanteleychuk.course.task1.assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;


class DescendingSorterTest {
    
    private DescendingSorter descendingSorter;
    
    @BeforeEach
    void init(){
        descendingSorter = new DescendingSorter();
    }
    
    @Test
    void descendingSort_shouldSortArrayInDescendingOrder_whenElementsArePositive() {
        List<Integer> expected = List.of(10, 8, 7, 0);
        List<Integer> actual = descendingSorter.descendingSort(new int[]{7, 8, 0, 10});
        boolean isEquals = expected.equals(actual);
        assertTrue(isEquals);
    }
    
    @Test
    void descendingSort_shouldRemoveNegativesAndSort_whenElementIsNegative() {
        List<Integer> expected = List.of(10, 8, 7, 0);
        List<Integer> actual = descendingSorter
                .descendingSort(new int[]{7, 8, 0, 10, -1, -214, -222});
        boolean isEquals = expected.equals(actual);
        assertTrue(isEquals);
    }
}
