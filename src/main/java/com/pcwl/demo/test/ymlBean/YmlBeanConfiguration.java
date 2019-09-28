package com.pcwl.demo.test.ymlBean;

public class YmlBeanConfiguration {
    /**
     * 获取application.yml文件里面mybatis下面的configuration
     */
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
        return "YmlBeanConfiguration{" +
                "aggressiveLazyLoading='" + aggressiveLazyLoading + '\'' +
                ", mapUnderscoreToCamelCase='" + mapUnderscoreToCamelCase + '\'' +
                '}';
    }

    public YmlBeanConfiguration(String aggressiveLazyLoading, String mapUnderscoreToCamelCase) {
        this.aggressiveLazyLoading = aggressiveLazyLoading;
        this.mapUnderscoreToCamelCase = mapUnderscoreToCamelCase;
    }

}
