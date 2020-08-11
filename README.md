# RoleBasedAccessSystemWithSpringShell

D:\SpringBoot>java -jar demo-0.0.1-SNAPSHOT.jar

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.2.RELEASE)

2020-08-11 09:15:30.419  INFO 15028 --- [           main] com.example.demo.DemoApplication         : Starting DemoApplication v0.0.1-SNAPSHOT on SURAJ-PC with PID 15028 (D:\SpringBoot\demo-0.0.1-SNAPSHOT.jar started by Suraj in D:\SpringBoot)
2020-08-11 09:15:30.467  INFO 15028 --- [           main] com.example.demo.DemoApplication         : No active profile set, falling back to default profiles: default
2020-08-11 09:15:35.617  INFO 15028 --- [           main] com.example.demo.DemoApplication         : Started DemoApplication in 7.554 seconds (JVM running for 8.979)
shell:>
shell:>
shell:>help
AVAILABLE COMMANDS

Built-In Commands
        clear: Clear the shell screen.
        exit, quit: Exit the shell.
        help: Display help about available commands.
        history: Display or save the history of previously run commands
        script: Read and execute commands from a file.
        stacktrace: Display the full stacktrace of the last error.

Demo Application
        add-system-resource: Assign a resource to a user
        add-user-resource: Assign a resource to a user
        add-user-role: Assign a role to a user
        have-access: check if a user is having access
        remove-user-role: Remove role from a user


Role Based Access Control:

Implement a role based auth system. System should be able to assign a role to user and remove a user from the role.

Entities are USER, ACTION TYPE, RESOURCE, ROLE

ACTION TYPE defines the access level(Ex: READ, WRITE, DELETE)

Access to resources for users are controlled strictly by the role.One user can have multiple roles. Given a user, action type and resource system should be able to tell whether user has access or not.



Please list down the assumptions made. Scope out things if you feel this takes more than 3 hours and add them to assumptions.

Note:

1. Use any object oriented programming language.

2. Code should be maintainable and production ready

3. Follow the best practices of engineering and design patterns.

4. A command line application with in memory models will suffice, a REST API or DBs are not required.
