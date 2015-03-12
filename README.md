# wicket-sample

##############################################################
# prerequisites: completion of Apache Fortress Ten Minute Guide.
# tested: fortress 1.0-RC40 snap on ubuntu 14.04.
##############################################################

Ten Steps to enable fortress security in Wicket-Sample project:

1. Add the login html files

2. Edit the pom.xml
  a. uncomment the dependencies at the top
  b. uncomment the maven ant task

3. Edit the web.xml
  a. uncomment the spring
  b. uncomment the java ee security constraints

4. Rename context.xml.example to context.xml

5. Rename fortress.properties.example to fortress.properties

6. Edit the LaunchPage, uncomment

7. Edit WicketApplication
 a. uncomment fortress session override
 b. uncomment fortress spring bean injector

8. Edit WicketSampleBasePage
 a. uncomment fortress spring bean injection
 b. change to FtBookmarkablePageLink

9. edit Page1.java, Page2.java, Page3.java, enable ftButtons.
 a-i. change to FtIndicatingAjaxButton

10. Build & Deploy (run from the command line):

mvn clean tomcat:deploy


##############################################################
To test: sign on with creds:
    a. wssuperuser/password
    b. wsuser1/password
    c. wsuser2/password
    d. wsuser3/password
