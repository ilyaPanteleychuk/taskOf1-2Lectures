package com.ilyapanteleychuk.course.task1.assignment3.model;

import java.util.Objects;


public class Sphere implements Shape {
    
    private double radius;
    
    public Sphere() {
    }
    
    public Sphere(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 3);
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sphere sphere = (Sphere) o;
        return Double.compare(sphere.radius, radius) == 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
