# wicket-sample

Steps to enable fortress security:

1. Edit the pom
  a. uncomment the dependencies at the top
  b. uncomment the maven ant task

2. Edit the web.xml
  a. uncomment the spring
  b. uncomment the java ee security constraints

3. Rename context.xml.example to context.xml

4. Rename fortress.properties.example to fortress.properties

5. Edit the LaunchPage, uncomment

6. Edit MyBasePage, uncomment

7. Edit WicketApplication, uncomment

8. run from the comment line:

mvn clean tomcat:deploy

9. sign on with creds:

    a. wssuperuser/password
    b. wsuser1/password
    c. wsuser2/password
    d. wsuser3/password
