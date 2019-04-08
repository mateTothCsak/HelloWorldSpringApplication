
*The goal of this asignment is to return the message "Hello World" to the browser from a database through an Http request.*

---

### Technology-stack:
* Maven
* Spring Boot
* MySQL
* Tomcat

---

### Configuration:

To be able to run this project a fitting table is needed.
The Message model consists of id and text only.
Here is an example query:


> CREATE DATABASE dbname;

> CREATE TABLE message ( id smallint unsigned not null auto_increment, text varchar(45) not null, constraint pk_example primary key (id) );

> INSERT INTO message( id, text) VALUES ( null, 'Hello World' );

Don't forget to fill out the application.properties file with your own database url, username and password.

Once these steps are done we can deploy our app in Tomcat.
//In case using Ubuntu
Step into your project directory in terminal - you should be at the same level with pom.xml
> mvn eclipse:eclipse

> mvn clean package

> We will get WAR file in target directory 

> Deploy war in Tomcat (copy war file to the webapp subfolder of Tomcat)

If done right, the result should look like this:

![](https://i.ibb.co/tsdg7LK/printscreen.png)