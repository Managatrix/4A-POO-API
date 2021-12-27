package fr.ensim.tp2.model;

import java.util.List;

public class AdresseEtalabRoot {
    private String type;
    private String version;
    private List<Feature> features;
    private String attribution;
    private String licence;
    private String query;
    private Filters filters;
    private int limit;
    
    @Override
    public String toString() {
        return "Root [attribution=" + attribution + ", features=" + features + ", filters=" + filters + ", licence="
                + licence + ", limit=" + limit + ", query=" + query + ", type=" + type + ", version=" + version + "]";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
