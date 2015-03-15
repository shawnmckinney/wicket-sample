# wicket-sample README

 This document demonstrates how to obtain, build and deploy the wicket sample without security enabled.

![wicket sample no security](src/main/javadoc/doc-files/Screenshot-wicket-sample-nosecurity.png "No Security")
-------------------------------------------------------------------------------
## Prerequisites for target machine:
1. Java 7 (or greater) sdk

2. Apache Maven 3

3. Apache Tomcat 7 or greater

-------------------------------------------------------------------------------
## Instructions for building deploying wicket-sample app to tomcat server:
1. Download wicket-sample from github: [Download ZIP](https://github.com/shawnmckinney/wicket-sample/archive/master.zip)

2. Extract the zip archive to your local machine.

3. cd wicket-sample-master

4. Set java and maven home env variables.

5. Run this command from the root package:
```
mvn clean tomcat:deploy
```
 *Note: if problem  with auto-deploy, manually deploy wicket-sample.war to webapps*

-------------------------------------------------------------------------------
## How to test wicket-sample app:
1. Point your web browser to the following location: [wicket sample home page](http://localhost:8080/wicket-sample)

2. click on the page links

3. click on the buttons

4. *Notice that there is no security enabled for this app*

-------------------------------------------------------------------------------
## How to enable security in wicket-sample app:
 Follow the instructions here: [README-ENABLE-FORTRESS.md](README-ENABLE-FORTRESS.md)