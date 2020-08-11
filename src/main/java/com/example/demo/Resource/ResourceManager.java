package com.example.demo.Resource;

import java.util.HashSet;

public class ResourceManager {
    private static ResourceManager uniqueInstance;
    private HashSet<Resource> resources;

    private ResourceManager() {  // Idea is to use singleton pattern; so making it private
        this.resources = new HashSet<>();
        resources.add(new Resource("dummy"));
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    public void removeResource(Resource resource) {
        resources.remove(resource);
    }

    public boolean containsResource(Resource resource) {
        if (resources.size() != 0) {
            return resources.contains(resource);
        }
        return false;
    }

    public static ResourceManager getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ResourceManager();
        }
        return uniqueInstance;
    }
}
