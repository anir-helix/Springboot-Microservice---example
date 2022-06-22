# Springboot-Microservice
### Service 1- Implementing Service Registry

Distributed Microservices Systems typically comprise a large number of smaller services. These services communicate with each other to perform operations. In order to communicate, one service needs the address of the other service to call. However, service addresses are dynamic in modern microservices systems. 
This is addressed by the "**Microservices Service Discovery**" pattern. 
With Eureka running in your microservices system, services (Eureka Clients) will register with the Eureka server with its name during start-up. 

# Setting up the Eureka Server : 
In Spring Boot microservices, you implement Eureka server as an independent Spring Boot service.

- **MAVEN DEPENDENCY :**

    The Eureka server requires the spring-boot-starter-web, spring-cloud-starter-netflix-eureka-server dependencies to be added in pom.xml file.

    pom.xml

    <dependency>
       <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
    </dependency>


- **EUREKA SERVER MAIN CLASS :**

    The next step is to refactor the main class to configure it as a Eureka server, like this.

    @EnableEurekaServer
    @SpringBootApplication
    public class ServiceRegistryApplication { ... }
    The preceding code adds the @EnableEurekaServer annotation on the class. This annotation is used to mark this Spring Boot application as a Eureka server.

- **CONFIGURE SETTINGS in application.properties:**

   The **application.properties** File
   server.port=8761
   eureka.client.register-with-eureka=false
   eureka.client.fetch-registry=false
   The preceding code sets the server.port property to set 8761 as the port number.

   It also sets the value for eureka.client.register-with-eureka to false. This prevents the Eureka server from registering itself on start-up.

When a Eureka server starts up, by default it searches for other peer registries. In order to prevent this, the code sets the eureka.client.fetch-registry property to false.

- **VIEW EUREKA SERVER REGISTRY**:

	To view Eureka server registry we need hit following locat host URL:
	http://localhost:8761/

