# Task_1
Task_1 of the Kaiburr Assessment

#### Please install all the required mvn packages
#### All the project related files are in springboot-mongodb folder.All other files are just screenshots

#### A Simple Backend Application is Designed with help of SpringBoot and MongoDB.

![Main Application Running](https://user-images.githubusercontent.com/122474267/227773753-a1908b1c-4df4-4160-a4a6-e8868cd2e08b.png)


## Requirement:
#### 1.Java JDK 8
#### 2.IDE for Running SpringBoot Application eg. IntelliJ
#### 3.MongoDB Compass
#### 4.Postman

#### PORT : 8080 is use for running the Application


## Application is able to 
#### create an object
#### fetching all stored objects in MongoDB
#### delete an object by id
#### search objects by name




## Create an object:

### endpoint: http://localhost:8080/create

![create Server Object1](https://user-images.githubusercontent.com/122474267/227773376-3479ad17-cdc7-4949-9d8e-78b526eab08a.png)
![create Server Object2](https://user-images.githubusercontent.com/122474267/227773389-b4945785-0a5d-4f56-8293-035bd80e2936.png)

## fetching all stored object in MongoDB

### endpoint : http://localhost:8080/getAll

![fetching all server objects](https://user-images.githubusercontent.com/122474267/227773519-63b6c5a1-58cf-4b7f-aef9-9c9533ec5a3c.png)

## delete an object by id

### endpoint : http://localhost:8080/delete/{id}
![delete Server Object by Id](https://user-images.githubusercontent.com/122474267/227773569-6183cecd-e1f7-4794-b164-3d767d204805.png)



## search objects by name

-all the objects with required name will be given as response

### endpoint : http://localhost:8080/name/{name}
![fetching server object by name](https://user-images.githubusercontent.com/122474267/227773623-07d84cb7-f51c-4455-85c0-8fe6def974d5.png)



## MongoDB server is running locally

![MongoDB](https://user-images.githubusercontent.com/122474267/227773734-727fb212-9f74-413f-9d5d-f59442dd6788.png)






