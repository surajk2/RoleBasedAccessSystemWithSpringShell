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


shell:>add-system-resource re1
invoking addResource method
shell:>add-system-resource re2
invoking addResource method
shell:>add-system-resource re3
invoking addResource method
shell:>
shell:>
shell:>
shell:>
shell:>add-user-role suraj Role1
invoking assignRoleToUser method
shell:>add-user-role suraj2 Role2
invoking assignRoleToUser method
shell:>add-user-role suraj3 Role3
invoking assignRoleToUser method
shell:>add-user-resource suraj re1
invoking assignResourceToUser method
shell:>add-user-resource suraj2 re2
invoking assignResourceToUser method
shell:>add-user-resource suraj3 re3
invoking assignResourceToUser method
shell:>have-access suraj 2 re1
invoking isUserHavingAccess method
true
shell:>have-access suraj2 2 re2
invoking isUserHavingAccess method
false
shell:>have-access suraj2 1 re2
invoking isUserHavingAccess method
true
shell:>have-access suraj2 5 re2
invoking isUserHavingAccess method
false
shell:>have-access suraj2 78326467 re2
invoking isUserHavingAccess method
false
shell:>have-access suraj2 32452345 re2
invoking isUserHavingAccess method
false
shell:>have-access suraj2 1 re1
invoking isUserHavingAccess method
User does not have permission to access this resource:[re1]
false
shell:>
shell:>
shell:>
shell:>
shell:>exit
