# 19CS1100_FSD

This repo is related to our FSD (Full Stack Developer) course-subject of 6th sem. In this repo, I have done  projects  related to java-maven, JPA, Spring-MVC framework etc.

### Spring MVC CRUD Application
Spring MVC CRUD Application with MySQL and Hibernate. This project gives an idea about how to create Spring MVC Full Application having Model, Controller and View binded together to perform CRUD operations with Database connection using Hibernate Classes.

### jpa-maven
JPA is used to persist data between Java object and relational database. JPA acts as a bridge between object-oriented domain models and relational database systems.
 - Create a persistence.xml to be used for unit testing in src/test/resources/META-INF:
 - Create an entity class named as StudentEntity.java undercom.java.jpa.student package that contains attributes s_id, s_name, s_age.
 - Now, map the entity class and other databases confiuguration in Persistence.xml file. 
 - Create a persistence class named as PersistStudent.java under com.javat.jpa.persist package to persist the entity object with data.
 - Create a persistence class named as UpdateStudent.java under com.java.jpa.update package to persist the entity object with data.
 - Create an entity class named as StudentEntity.java under com.java.jpa.student package that contains attributes s_id, s_name and s_age.
 - Now, map the entity class and other databases confiuguration in Persistence.xml file.
### Prerequisites
 You are required to have few tools before you start with using the source code.

- JDK 1.8
- Maven
- IDE (Recommended - eclipse)
- My SQL 5.6
- My SQL workbench 
- git
Install JDK, Maven and Git as first step, before you get the the code base setup.

### Setup Code Base


- Build a Project using Maven Project.
- Manages Dependencies - Web Layer (Spring MVC), Data Layer (JPA - Hibernate) etc..
- create  database and table in SQl and set connection.
- Run the application locally - Tomcat server


### Run

You will require a Tomcat 9 version and some web server to run this web application. Run with any web server and view the output on a browser.

### Demo:
![https://raw.githubusercontent.com/Saurabh-pec/19CS1100_FSD/main/Database-setup.jpg](Database-setup)
![https://raw.githubusercontent.com/Saurabh-pec/19CS1100_FSD/main/JPA_DatabaseTable.jpg](JPA_DatabaseTable)
![https://raw.githubusercontent.com/Saurabh-pec/19CS1100_FSD/main/MVC_CURD(view%20list).jpg](MVC_CRUD-employees_list)
![https://raw.githubusercontent.com/Saurabh-pec/19CS1100_FSD/main/AddEmployee.jpg](AddEmployee)
![https://raw.githubusercontent.com/Saurabh-pec/19CS1100_FSD/main/mvc-web-form.jpg](mvc-web-form-RailwayReservation)
![https://raw.githubusercontent.com/Saurabh-pec/19CS1100_FSD/main/reservationConfirmation.jpg](reservationConfirmation)

