This is free and unencumbered software released into the public domain.

# wicket-sample README
# Prerequisites for target machine:
# 1. Java 7 (or greater) sdk
# 2. Apache Maven 3
# 3. Apache Tomcat 7 or greater

# Instructions for downloading app and generating the install doc:

# 1. Download wicket-sammple from github: https://github.com/shawnmckinney/wicket-sample/archive/master.zip

# 2. Extract the zip archive to your local machine.

# 3. cd wicket-sample-master

# 4. Set java and maven home env variables.

# 5. Run this command from the root package:
# mvn clean tomcat:deploy

# 6. Point your web browser to the following location:
http://localhost:8080/wicket-sample

Click on the links, buttons.  Notice there is no security currently enabled for this app.

To enable security, follow the instructions under: ENABLE-FORTRESS-README.md