package com.danielme.spring.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dependency {

    private final SubDependency subDependency;

    @Value("${url}")
    private String url;

    public Dependency(SubDependency subDependency) {
        super();
        this.subDependency = subDependency;
    }

    public String getClassName() {
        return this.getClass().getSimpleName();
    }

    public String getSubdependencyClassName() {
        return subDependency.getClassName();
    }

    public int addTwo(int i) {
        return i + 2;
    }

    public String getUrl() {
        return url;
    }

}
