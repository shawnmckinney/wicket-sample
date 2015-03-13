This is free and unencumbered software released into the public domain.

# wicket-sample ENABLE FORTRESS README
# Prerequisites for target machine:
1. completion of README.md
2. completion of the following steps in the Apache Fortress Ten Minute Guide:
   Setup Apache Directory Server
   Setup Apache Directory Studio
   Build Apache Fortress Core
   Build Apache Fortress Realm
   Setup Apache Tomcat Web Server
   Setup Apache Fortress Web

# Steps to enable fortress

#1. Download wicket-sample project

# a. extract the zip

# b. follow the instructions in README

You may now hit the sample web app:

http://localhost:8080/wicket-sample

To enable security, keep going…

# 2. Add the static /login html files

If you downloaded the wicket-sample source, this is already taken care of.

# 3. Add LoginPage, LogoutPage java and html

Again these are already part of the wicket-sample source distro.

# 4. Edit the pom.xml

# a. uncomment the dependencies near the top

# b. uncomment the maven ant task near the bottom

At the completion of this step, the necessary binaries will be available to the app.

# 5. Edit the web.xml

# a. uncomment the spring settings

# b. uncomment the java ee security constraints

Af the completion of this step, java EE security has been enabled.

# 6. Rename context.xml.example to context.xml

The context.xml is how the fortress realm integrates with the sample wicket application.

# 7. Rename fortress.properties.example to fortress.properties.

After completing the fortress ten minute guide, this step should be familiar to you.  It is where the fortress runtime is connected with a remote ldap server.

# 8. Edit WicketApplication.java

# a. uncomment fortress session override

# b. uncomment fortress spring bean injector

These steps are necessary to get fortress hooked into the sample app.

# 8. Edit WicketSampleBasePage.java

# a. uncomment fortress spring bean injection

These beans are how the app calls fortress

# b. uncomment call to enableFortress

Needed to manage the sessions on behalf of the users.

# c. change to FtBookmarkablePageLink

This component maps the page links to fortress permissions.

# 9. Edit Page1.java, Page2.java, Page3.java

# a – i. change to FtIndicatingAjaxButton

This component maps the page buttons to fortress permissions

# 10. Build & Deploy (run from the command line):

mvn clean tomcat:deploy

This step builds the web app, loads the wicket sample security policy into ldap, and deploys to tomcat.

##############################################################
# To test: sign on with creds:
# a. wssuperuser/password
# b. wsuser1/password
# c. wsuser2/password
# d. wsuser3/password