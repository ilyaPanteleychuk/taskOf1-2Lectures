package com.ilyapanteleychuk.course.task1.assignment1;

import java.util.Arrays;


public class DescendingSorter {
    
    public int[] descendingSort(int[] inputArray){
        int[] outputArray = Arrays.stream(inputArray)
                .filter(el -> el >= 0).toArray();
        for(int i = 0; i < outputArray.length; i++){
            int temp;
            for(int j = i + 1; j < outputArray.length; j++){
                if(outputArray[i] < outputArray[j]){
                    temp = outputArray[i];
                    outputArray[i] = outputArray[j];
                    outputArray[j] = temp;
                }
            }
        }
        return outputArray;
    }
}
