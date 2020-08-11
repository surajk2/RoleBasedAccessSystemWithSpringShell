package com.example.demo;

import com.example.demo.Factory.RoleFactory;
import com.example.demo.Permission.ActionType;
import com.example.demo.Resource.Resource;
import com.example.demo.Resource.ResourceManager;
import com.example.demo.Role.Role;

import java.util.*;

public class AccessControl {
    private static AccessControl uniqueInstance;

    private HashMap<User, Role> userRoleMap;
    private HashMap<User, Set<Resource>> userResourceMap;


    private AccessControl() {
        userRoleMap = new HashMap<>();
        userResourceMap = new HashMap<>();
    }

    private HashMap<User, Role> getUserRoleMap() {
        return userRoleMap;
    }

    private HashMap<User, Set<Resource>> getUserResourceMap() {
        return userResourceMap;
    }

    public static AccessControl getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new AccessControl();
        }
        return uniqueInstance;
    }

    // Assuming that each user will be having access to a set of few resources, not all
    public void assignResourceToUser(String userName, String resourceName) {
        // check if resource exists, otherwise return false
        if (!ResourceManager.getInstance().containsResource(new Resource(resourceName))) {
            System.out.println("resource[" + resourceName + "]does not exist, can't be assigned");
            return;
        }

        User user = new User(userName);

        Set<Resource> resourceSet = getInstance().getUserResourceMap().getOrDefault(user, Collections.emptySet());
        if (resourceSet.size() == 0) {
            resourceSet = new HashSet<Resource>();
        }
        resourceSet.add(new Resource(resourceName));
        getInstance().getUserResourceMap().put(user, resourceSet);
    }

    public void assignRoleToUser(String userName, String roleName) {
        User user = new User(userName);
        Role role = RoleFactory.createRole(roleName);
        getInstance().getUserRoleMap().put(user, role);
    }

    public void removeUserFromRole(String userName) {
        User user = new User(userName);
        if (!getInstance().getUserRoleMap().containsKey(user)) {
            System.out.println("user[" + userName + "]has not been assigned any role");
            return;
        }
        getInstance().getUserRoleMap().replace(user, RoleFactory.createRole("NONE"));
        getInstance().getUserResourceMap().remove(user);  // remove previously assigned resources
    }

    // ActionType : READ - 0, WRITE - 1, DELETE - 2, NONE - 3
    public boolean isUserHavingAccess(String userName, int actionType, String resourceName) {
        User user = new User(userName);

        // check if resource exists in set of resources maintained by ResourceManager, otherwise return false
        if (!ResourceManager.getInstance().containsResource(new Resource(resourceName))) {
            System.out.println("This resource:[" + resourceName + "]" + "is not found");
            return false;
        }

        Set<Resource> userResourceSet = getInstance().getUserResourceMap().getOrDefault(user, Collections.emptySet());
        if (userResourceSet.size() == 0) {
            System.out.println("User[" + userName + "]has not been assigned with any resource yet");
            return false;
        }

        // check if resource exists in individual resource set of each user, otherwise return false
        if (!userResourceSet.contains(new Resource(resourceName))) {
            System.out.println("User does not have permission to access this resource:[" + resourceName + "]");
            return false;
        }

        ActionType mActionType = ActionType.MAX;
        if (actionType == 0) {
            mActionType = ActionType.READ;
        } else if (actionType == 1){
            mActionType = ActionType.WRITE;
        } else if (actionType == 2) {
            mActionType = ActionType.DELETE;
        }

        Role roleUser = getInstance().getUserRoleMap().get(user);
        ActionType [] arr = roleUser.getSetOfActions();
        for (ActionType action : arr) {
            if ((action == mActionType) && (mActionType != ActionType.MAX)) {
                return true;
            }
        }

        return false;
    }
}
