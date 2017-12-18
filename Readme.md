# Demo Project using Spring Boot and JPA

Features:
- Spring Boot Application
- Rest service
- Swagger documentation
- H2 file database
- JPA with transactions
- Cache

## Actuators links
Example: http://localhost:<management.port>/metrics

**/metrics** Shows “metrics” information for the current application.

**/health** Shows application health information.

**/info** Displays arbitrary application info.

**/configprops** Displays a collated list of all @ConfigurationProperties.

**/mappings** Displays a collated list of all @RequestMapping paths.

**/beans** Displays a complete list of all the Spring Beans in your application.

**/env** Exposes properties from Spring’s ConfigurableEnvironment.

**/trace** Displays trace information (by default the last few HTTP requests).

## Swagger

http://localhost:8080/swagger-ui.html

http://localhost:8080/swagger-resources/configuration/security

http://localhost:8080/swagger-resources/configuration/ui

http://localhost:8080/v2/api-docs

