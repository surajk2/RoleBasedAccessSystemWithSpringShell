package com.example.demo.Role;

import com.example.demo.Permission.ActionType;

public class DummyRole implements Role{
    private String roleName = "DummyRole";
    private ActionType[] setOfActions = new ActionType[]{ActionType.MAX};

    public DummyRole() {
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
