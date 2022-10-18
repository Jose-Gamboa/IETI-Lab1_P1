# Author: José Manuel Gamboa Gómez

## Part 1: Implementing the Users Microservice RESTFUL API

10. Create a new package called dto and inside define your UserDto object with at least the following fields:

    ![UserDTO](img/UserDTO%20created.png)

11. Create a new package called entities and inside define your User entity object with the same fields as the dto version (Types don't matter yet, just be sure both DTO classes and Data classes types are consistent enough):

    ![Entities Folder](img/Entiti%20folder.png)

    ![User class](img/User%20class.png)

12. Create a new package called service and inside create the following interface:

    ![Service Folder](img/Service%20Folder.png)

    ![Service Interface](img/Service%20Interface.png)

13. Create an implementation of the UserService using a HashMap data structure inside and make your service implementation UserServiceHashMap injectable using the @Service annotation.

    ![UserService Impl](img/UserService%20Impl.png)

15. Create a new package called controller and create a new class UserController inside.

    ![Controller Package](img/Controller%20Pack.png)

16. Tasks:

+ Annotate your UserController so it becomes a REST Controller
+ Inject your UserService implementation inside the UserController via the constructor
+ Implement all the endpoints needed to interact with you UserService. Use the following method signatures to help you achieve the Level 2 RESTFUL Maturity

  ![REST Impl](img/REST%20Impl.png)

22. Test all endpoints:

+ _**Post Endpoint Test**_

  ![Post Test](img/Post%20Test.png)

+ _**Get All Endpoint Test**_

  ![Get All Test](img/Get%20All%20Test.png)

+ _**Get Id Endpoint Test**_

  ![Get Id Test](img/Get%20Id%20Test.png)

+ _**Put Endpoint Test**_

  ![Put Test](img/Put%20Test.png)

+ _**Delete Endpoint Test**_

  ![Delete Test](img/Delete%20Test.png)


## Part 2: Connecting my MongoDB Cluster with Spring Boot

1. Login into your MongoDB Atlas account, click connect on the cluster you created on Part 1:

    ![DBMongo](img/DB Mongo.png)

2. Select Connect your application:

    ![Mongo Connection](img/Connect Mongo.png)

3. Choose the Java driver, select the latest version and copy the connection string:

   ![String Java Connection](img/String Connection.png)

4. Add an Environment Variable to the application.properties file to store the MongoDB URI:

   ![App Properties](img/AppProp EV.png)

5. Add the environment variable to IntelliJ Idea by editing the Run/Debug Configurations:

   ![Enviroment Variable](img/EnvVar.png)

6. Add the Spring Boot starter data MongoDB dependency to your build.gradle:

   ![Dependencia](img/Dependencies.png)

7. Run your project and verify that the connection is successful:

   ![Connecion Mongo](img/Test Conec Mongo.png)

8. To avoid future problems connecting to your Atlas instance (because of ip whitelist) find the way to allow connections from any Ip (not recommended for real-world applications):

   ![Allow Acces](img/Net Acces.png)

## Part 3: Implementing the MongoDB Service

1. Create a new package called repository:

   ![Pack Repo](img/Repo Pack.png)

2. Modify your current User class to use MongoDB notations:

   ![User Mod](img/User Mongo.png)

3. Create a new interface called UserRepository inside the repository package:

   ![Interface UserRepo](img/UserRepository.png)