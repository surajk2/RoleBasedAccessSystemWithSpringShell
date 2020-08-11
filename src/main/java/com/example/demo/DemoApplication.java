package com.example.demo;

import com.example.demo.Resource.Resource;
import com.example.demo.Resource.ResourceManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@SpringBootApplication
@ShellComponent
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@ShellMethod("Assign a role to a user")
	public void addUserRole (String userName, String userRole) {
		System.out.println("invoking assignRoleToUser method");
		AccessControl.getInstance().assignRoleToUser(userName, userRole);
	}

	@ShellMethod("Assign a resource to a user")
	public void addUserResource (String userName, String userResource) {
		System.out.println("invoking assignResourceToUser method");
		AccessControl.getInstance().assignResourceToUser(userName, userResource);
	}

	@ShellMethod("Assign a resource to a user")
	public void addSystemResource (String sysResource) {
		System.out.println("invoking addResource method");
		ResourceManager.getInstance().addResource(new Resource(sysResource));
	}

	@ShellMethod("Remove role from a user")
	public void removeUserRole (String userName) {
		System.out.println("invoking removeUserFromRole method");
		AccessControl.getInstance().removeUserFromRole(userName);
	}

	@ShellMethod("check if a user is having access")
	public boolean haveAccess (String userName, int action, String resource) {
		System.out.println("invoking isUserHavingAccess method");
		return AccessControl.getInstance().isUserHavingAccess(userName, action, resource);
	}
}
