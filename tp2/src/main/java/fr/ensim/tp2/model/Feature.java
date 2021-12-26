package fr.ensim.tp2.model;

public class Feature {
    private String type;
    private Geometry geometry;
    private Properties properties;

    @Override
    public String toString() {
        return "Feature [geometry=" + geometry + ", properties=" + properties + ", type=" + type + "]";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
