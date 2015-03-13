# wicket-sample

##############################################################
# prerequisites: completion of Apache Fortress Ten Minute Guide.
# tested: fortress 1.0-RC40 snap on ubuntu 14.04.
##############################################################

Ten Steps to enable fortress and java ee security inside the Wicket-Sample project.

Complete steps to enable fortress and java ee security inside of a sample wicket app.
The steps below correspond with this project's source.

1. Add the login html files

2. Edit the pom.xml
  a. uncomment the dependencies at the top
  b. uncomment the maven ant task

3. Edit the web.xml
  a. uncomment the spring
  b. uncomment the java ee security constraints

4. Rename context.xml.example to context.xml

5. Rename fortress.properties.example to fortress.properties.
  - file points the security calls to an ldap server.

6. Edit the LaunchPage, uncomment

7. Edit WicketApplication.java
 a. uncomment fortress session override
 b. uncomment fortress spring bean injector

8. Edit WicketSampleBasePage.java
 a. uncomment fortress spring bean injection
 b. uncomment call to enableFortress
 c. change to FtBookmarkablePageLink

9. edit Page1.java, Page2.java, Page3.java
 a - i. change to FtIndicatingAjaxButton

10. Build & Deploy (run from the command line):

mvn clean tomcat:deploy

##############################################################
To test: sign on with creds:
    a. wssuperuser/password
    b. wsuser1/password
    c. wsuser2/password
    d. wsuser3/password
