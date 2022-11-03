package com.ilyapanteleychuk.course.task1.assignment3.model;

import java.util.Objects;


public abstract class GeometricalFigure {

    protected double volume;
    
    public abstract void calculateVolume();
    
    public double getVolume(){
        return volume;
    }
    
    @Override
    public String toString() {
        return "GeometricalFigure{" +
                "volume=" + volume +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeometricalFigure that = (GeometricalFigure) o;
        return Double.compare(that.volume, volume) == 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }
}
