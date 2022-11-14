package com.ilyapanteleychuk.course.task1.assignment1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class DescendingSorter {
    
    public List<Integer> descendingSort(int[] inputArray){
        List<Integer> outputList = IntStream.of(inputArray).boxed()
                .collect(Collectors.toList());
        return outputList.stream().filter(el -> el >= 0).sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
