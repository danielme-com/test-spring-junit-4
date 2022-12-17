package com.danielme.spring.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dependency {

    private final SubDependency subDependency;
    private final String url;

    public Dependency(SubDependency subDependency, @Value("${url}") String url) {
        this.subDependency = subDependency;
        this.url = url;
    }

    public String getSubdependencyClassName() {
        return subDependency.getClassName();
    }

    public String getUrl() {
        return url;
    }

}
