package com.example.demo.Factory;

import com.example.demo.Role.*;

public class RoleFactory {

    public static Role createRole(String roleName) {
        Role role = null;

        if (roleName.equals("Role1")) {
            role = new Role1();
        } else if (roleName.equals("Role2")) {
            role = new Role2();
        } else if (roleName.equals("Role3")) {
            role = new Role3();
        } else if (roleName.equals("Role4")) {
            role = new Role4();
        } else if (roleName.equals("NONE")) {
            role = new NoRole();
        } else {
            role = new DummyRole();
        }

        return role;
    }
}
