package com.pcwl.demo.test.ymlBean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//添加到容器中
//告诉Spring这是一个配置类
@Component
@ConfigurationProperties(prefix = "mybatis")
public class YmlBeanMybatis {
/**
 * 获取application.yml文件里面mybatis的配置
 */
    private String mapperLocations;
    private String typeAliasesPackage;
    private YmlBeanConfiguration ybc;

    public String getMapperLocations() {
        return mapperLocations;
    }

    public void setMapperLocations(String mapperLocations) {
        this.mapperLocations = mapperLocations;
    }

    public String getTypeAliasesPackage() {
        return typeAliasesPackage;
    }

    public void setTypeAliasesPackage(String typeAliasesPackage) {
        this.typeAliasesPackage = typeAliasesPackage;
    }

    public YmlBeanConfiguration getYbc() {
        return ybc;
    }

    public void setYbc(YmlBeanConfiguration ybc) {
        this.ybc = ybc;
    }

    public YmlBeanMybatis(String mapperLocations, String typeAliasesPackage, YmlBeanConfiguration ybc) {
        this.mapperLocations = mapperLocations;
        this.typeAliasesPackage = typeAliasesPackage;
        this.ybc = ybc;
    }

    public YmlBeanMybatis() {
    }

    @Override
    public String toString() {
        return "YmlBeanMybatis{" +
                "mapperLocations='" + mapperLocations + '\'' +
                ", typeAliasesPackage='" + typeAliasesPackage + '\'' +
                ", ybc=" + ybc +
                '}';
    }
}
