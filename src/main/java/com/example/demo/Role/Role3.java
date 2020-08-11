package com.example.demo.Role;

import com.example.demo.Permission.ActionType;

public class Role3 implements Role{
    private String roleName = "Role3";
    private ActionType[] setOfActions = new ActionType[]{ActionType.READ};

    public Role3() {
        this.roleName = roleName;
        this.setOfActions = setOfActions;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setSetOfActions(ActionType[] setOfActions) {
        this.setOfActions = setOfActions;
    }

    public ActionType[] getSetOfActions() {
        return setOfActions;
    }
}
