package com.example.demo.Role;

import com.example.demo.Permission.ActionType;

public class Role4 implements Role{
    private String roleName = "Role4";
    private ActionType[] setOfActions = new ActionType[]{ActionType.NONE};

    public Role4() {
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
