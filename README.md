# wicket-sample README
## Prerequisites for target machine:
### 1. Java 7 (or greater) sdk
### 2. Apache Maven 3
### 3. Apache Tomcat 7 or greater

## Instructions for deploying wicket-sample app to tomcat server:

### 1. Download wicket-sample from github: https://github.com/shawnmckinney/wicket-sample/archive/master.zip

### 2. Extract the zip archive to your local machine.

### 3. cd wicket-sample-master

### 4. Set java and maven home env variables.

### 5. Run this command from the root package:
mvn clean tomcat:deploy

[Note: if problem  with auto-deploy, manually deploy wicket-sample.war to webapps]

### 6. Point your web browser to the following location:
http://localhost:8080/wicket-sample

#### Click on the links, buttons.  There is no security enabled for this app.

#### To enable security, follow the instructions here: ENABLE-FORTRESS-README.md