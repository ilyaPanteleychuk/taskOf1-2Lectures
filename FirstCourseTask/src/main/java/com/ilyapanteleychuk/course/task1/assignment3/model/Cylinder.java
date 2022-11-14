package com.ilyapanteleychuk.course.task1.assignment3.model;

import java.util.Objects;


public class Cylinder implements Shape {
    
    private double radius;
    private double height;
    
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cylinder cylinder = (Cylinder) o;
        return Double.compare(cylinder.radius, radius) == 0
                && Double.compare(cylinder.height, height) == 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(radius, height);
    }
}
