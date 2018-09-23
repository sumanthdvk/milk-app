# milk-app

We have Maven Wrapper in the project, which comes by default with Spring Boot starter project.
- With this one need not have maven installed and have it in the PATH.
- So, instead of `mvn clean install`, we might have to use `./mvnw.cmd clean install`. Google for more.

We have added `spring-security` in the project. So, spring boot itself adds a form.
Credentials would be -
- user is user
- password is printed on the console. Look for `Using default security password: 78fa095d-3f4c-48b1-ad50-e24c31d5cf35`
  More info [here](https://stackoverflow.com/questions/37285016/what-is-username-and-password-when-starting-spring-boot-with-tomcat)
