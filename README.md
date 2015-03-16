# wicket-sample README

 Last updated: March 15, 2015

 This document demonstrates how to obtain, build and deploy the wicket sample without security.

-------------------------------------------------------------------------------
## Prerequisites
1. Java 7 (or greater) sdk
2. Apache Maven 3
3. Apache Tomcat 7 or greater

-------------------------------------------------------------------------------
## How to build and deploy
1. [Download ZIP](https://github.com/shawnmckinney/wicket-sample/archive/master.zip)

2. Extract the zip archive to your local machine.

3. cd wicket-sample-master

4. Set java and maven home env variables.

5. Run this command from the root package:
```
mvn clean tomcat:deploy
```
 *Note: if problem  with auto-deploy, manually deploy wicket-sample.war to webapps*

-------------------------------------------------------------------------------
## How to test
1. Open link to [http://localhost:8080/wicket-sample](http://localhost:8080/wicket-sample)

 ![wicket sample no security](src/main/javadoc/doc-files/Screenshot-wicket-sample-nosecurity.png "No Security")

2. click on the page links

3. click on the buttons

4. *Notice that there is no security enabled for this app*

-------------------------------------------------------------------------------
## How to enable security
 Follow the instructions here: [README-ENABLE-FORTRESS.md](README-ENABLE-FORTRESS.md)