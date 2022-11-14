package com.ilyapanteleychuk.course.task1.assignment2;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class HashtagCalculator {
    
    public Map<String, Integer> countPopularHashTags(List<String> texts) {
        Map<String, Integer> hashtagsMap = new LinkedHashMap<>();
        for (String text : texts) {
            Set<String> uniqueSentence = Arrays.stream(text.split(" "))
                    .filter(el -> el.startsWith("#") && el.matches(".*[a-zA-Z]+.*"))
                    .map(el -> el.replaceAll("[-+.^:,]", "").toLowerCase())
                    .collect(Collectors.toSet());
            for (String word : uniqueSentence) {
                hashtagsMap.compute(word, (k, v) -> (v == null) ? 1 : v + 1);
            }
        }
        Map<String, Integer> output =  hashtagsMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        while(output.keySet().size() > 5){
            List<String> keys = new ArrayList<>(output.keySet());
            output.remove(keys.get(keys.size() - 1));
        }
        return output;
    }
}
