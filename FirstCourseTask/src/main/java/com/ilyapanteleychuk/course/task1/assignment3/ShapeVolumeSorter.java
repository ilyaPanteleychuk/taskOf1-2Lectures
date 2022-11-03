package com.ilyapanteleychuk.course.task1.assignment3;

import com.ilyapanteleychuk.course.task1.assignment3.model.GeometricalFigure;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ShapeVolumeSorter {
    
    public List<GeometricalFigure> sortVolume(List<GeometricalFigure> shapes){
        shapes.forEach(GeometricalFigure::calculateVolume);
        return shapes.stream()
                .sorted(Comparator.comparingDouble(GeometricalFigure::getVolume))
                .collect(Collectors.toList());
    }
}
