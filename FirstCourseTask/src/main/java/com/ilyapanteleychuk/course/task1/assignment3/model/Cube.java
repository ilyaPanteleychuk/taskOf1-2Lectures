package com.ilyapanteleychuk.course.task1.assignment3.model;

import java.util.Objects;


public class Cube implements Shape {
    
    private double side;
    
    public Cube() {
    }
    
    public Cube(double side) {
        this.side = side;
    }
    
    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
    
    public double getSide() {
        return side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.side, side) == 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}
