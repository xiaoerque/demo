package com.pcwl.demo.test.ymlBean;


public class YmlConfiguration {

    private String aggressiveLazyLoading;
    private String mapUnderscoreToCamelCase;

    public String getAggressiveLazyLoading() {
        return aggressiveLazyLoading;
    }

    public void setAggressiveLazyLoading(String aggressiveLazyLoading) {
        this.aggressiveLazyLoading = aggressiveLazyLoading;
    }

    public String getMapUnderscoreToCamelCase() {
        return mapUnderscoreToCamelCase;
    }

    public void setMapUnderscoreToCamelCase(String mapUnderscoreToCamelCase) {
        this.mapUnderscoreToCamelCase = mapUnderscoreToCamelCase;
    }

    @Override
    public String toString() {
        return "YmlConfiguration{" +
                "aggressiveLazyLoading='" + aggressiveLazyLoading + '\'' +
                ", mapUnderscoreToCamelCase='" + mapUnderscoreToCamelCase + '\'' +
                '}';
    }
}
