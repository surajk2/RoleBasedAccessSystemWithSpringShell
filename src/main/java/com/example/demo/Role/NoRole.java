package com.example.demo.Role;

import com.example.demo.Permission.ActionType;

public class NoRole implements Role {
    private String roleName = "NoRole";
    private ActionType[] setOfActions = new ActionType[]{ActionType.NONE};

    public NoRole() {
        this.roleName = roleName;
        this.setOfActions = setOfActions;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setSetOfActions(ActionType[] setOfActions) {
        this.setOfActions = setOfActions;
    }

    @Override
    public ActionType[] getSetOfActions() {
        return setOfActions;
    }
}
