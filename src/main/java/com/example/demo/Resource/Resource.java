package com.example.demo.Resource;

import java.util.Objects;

public class Resource {
    String resourceName;
    Integer resourceId;

    public Resource(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Resource)) return false;
        Resource resource = (Resource) o;
        return Objects.equals(resourceName, resource.resourceName);
    }

    @Override
    public int hashCode() {
        int hash = 10;
        hash = 25 * hash + this.resourceName.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resourceName='" + resourceName + '\'' +
                ", resourceId=" + resourceId +
                '}';
    }
}
