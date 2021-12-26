package fr.ensim.tp2.model;

public class Filters {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Filters [type=" + type + "]";
    }
}
