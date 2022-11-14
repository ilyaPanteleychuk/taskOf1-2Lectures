package com.ilyapanteleychuk.course.task1.assignment3;

import com.ilyapanteleychuk.course.task1.assignment3.model.Shape;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ShapeVolumeSorter {
    
    public List<Shape> sortVolume(List<Shape> shapes){
        shapes.forEach(Shape::calculateVolume);
        return shapes.stream()
                .sorted(Comparator.comparingDouble(Shape::calculateVolume))
                .collect(Collectors.toList());
    }
}
