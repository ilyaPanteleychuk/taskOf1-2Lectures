package com.ilyapanteleychuk.course.task1.assignment3;

import com.ilyapanteleychuk.course.task1.assignment3.model.Cube;
import com.ilyapanteleychuk.course.task1.assignment3.model.Cylinder;
import com.ilyapanteleychuk.course.task1.assignment3.model.Shape;
import com.ilyapanteleychuk.course.task1.assignment3.model.Sphere;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ShapeVolumeSorterTest {
    
    @Test
    void sortVolume_shouldSortVolumeOfShapesInAscendingOrder() {
        ShapeVolumeSorter shapeVolumeSorter = new ShapeVolumeSorter();
        Shape cube = new Cube(10);
        Shape sphere = new Sphere(3);
        Shape cylinder = new Cylinder(10, 12);
        List<Shape> actualToSort = new ArrayList<>();
        actualToSort.add(cube);
        actualToSort.add(sphere);
        actualToSort.add(cylinder);
        List<Shape> expected = new ArrayList<>();
        expected.add(sphere);
        expected.add(cube);
        expected.add(cylinder);
        List<Shape> actual = shapeVolumeSorter.sortVolume(actualToSort);
        assertEquals(expected, actual);
    }
}
