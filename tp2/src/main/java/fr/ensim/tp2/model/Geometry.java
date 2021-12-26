package fr.ensim.tp2.model;

import java.util.Arrays;

public class Geometry {
    private String type;
    private double[] coordinates;

    @Override
    public String toString() {
        return "Geometry [coordinates=" + Arrays.toString(coordinates) + ", type=" + type + "]";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }
}
