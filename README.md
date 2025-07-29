© 2025 iamfortress.net
# wicket-sample README

* This document demonstrates how to obtain, build and deploy the Apache Fortress Wicket Sample application.
* To complete this tutorial, first follow the steps in this README.
* Followed by the steps here: [README-ENABLE-FORTRESS.md](README-ENABLE-FORTRESS.md)

-------------------------------------------------------------------------------
## Prerequisites
1. Java >= 17
2. Apache Maven >= 3
3. Apache Tomcat >= 10

-------------------------------------------------------------------------------
1. Stage the project source:

 a. Download and extract from Github:

```bash
wget https://github.com/shawnmckinney/wicket-sample/archive/master.zip
```

 -- Or --

 b. Or `git clone` locally:

```git
git clone https://github.com/shawnmckinney/wicket-sample.git
```

2. cd wicket-sample

3. Set java and maven home env variables.

4. Prepare tomcat to allow autodeploy of wicketsample web app:

```
sudo vi /usr/local/tomcat8/conf/tomcat-users.xml
```

5. Add tomcat user to deploy wicketsample:

```
<role rolename="manager-script"/>
<user username="tcmanager" password="m@nager123" roles="manager-script"/>
```

6. Save and exit tomcat-users.xml file and restart tomcat.

7. Run this command from the root package:

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
