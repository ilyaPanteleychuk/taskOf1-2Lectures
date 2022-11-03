package com.ilyapanteleychuk.course.task1.assignment3;

import com.ilyapanteleychuk.course.task1.assignment3.model.Cube;
import com.ilyapanteleychuk.course.task1.assignment3.model.Cylinder;
import com.ilyapanteleychuk.course.task1.assignment3.model.GeometricalFigure;
import com.ilyapanteleychuk.course.task1.assignment3.model.Sphere;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ShapeVolumeSorterTest {
    
    @Test
    void sortVolume_shouldSortVolumeOfShapesInAscendingOrder() {
        ShapeVolumeSorter shapeVolumeSorter = new ShapeVolumeSorter();
        List<GeometricalFigure> actualToSort = new ArrayList<>();
        actualToSort.add(new Cube(10));
        actualToSort.add(new Sphere(3));
        actualToSort.add(new Cylinder(10, 12));
        List<GeometricalFigure> expected = new ArrayList<>();
        expected.add(new Sphere(3));
        expected.add(new Cube(10));
        expected.add(new Cylinder(10, 12));
        expected.forEach(GeometricalFigure::calculateVolume);
        List<GeometricalFigure> actual = shapeVolumeSorter.sortVolume(actualToSort);
        assertEquals(expected, actual);
    }
}
