
# Production Ready Spring Boot Features

This project covers the basic SpringBoot appliaction having the below files:

1. A PostDTO
2. A PostEntity
3. Having a Post Repository
4. Have a Service interface 
5. Class which implement the Service interface known as PostServiceImpl
6. Having a Controller with below endPoints:
7. Gracefully handled the Error using the Advice 
8. Added a auto restart using the library -> spring-boot-devtools
9. Enable the Auditing for createdDate, updatedDate and updatedBy without using Spring Security.
10. Created a AuditorAwareImp class to set the Admin value as we are not using Spring Security as of now.
11. And declare it in a global level AppConfig by creating a bean of it. So where ever auditing ios required as of now implemented it in the PostEntity class hence extended the AuditableEntity class.
12. Any Db changes will be tracked by AuditableEntity class.
13. Used the Hibernate Envers for what had changes like more advanced features.
14. Created one more end point for Admin to see the changes made my any.
15. Created a Connection with the previous API or we can can say 3 rd party API connection using RestClient.
16. All the 3rd Party repo we made connection with is listed down in this repo (https://github.com/SushantaNandy/springbootweb).
17. I had created a testcases rather than a controllers inside my Test class.
18. Gracefully handling of error are also taken place for for either server side or client side error.
19. Used SLF4J for logging error and store it in application.log file
20. And used Logback configuration xml for capuring logs not more then 100 Mb inside logs folder.
21. Used of actuator and declared in application.properties files and more information about the application and it provide nice little apis to view more information about our app.
22. Added a swagger UI file in the url http://localhost:9000/swagger-ui/index.html
23. Added my swagger locally as well in swagger.json file. After running the application paste the content in https://editor.swagger.io/ to view and use the end points.


## API Reference

#### Create a new Post based on provided title and description in Body

```http
  POST http://127.0.0.1:8080/posts
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `jSON body` | `string` | **Required** title and dsecription |

#### Get all Posts

```http
  GET http://127.0.0.1:8080/posts
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| null      |          | **Required**. Fetch All the Posts |


#### Get all Posts based on postId

```http
  GET http://127.0.0.1:8080/posts/{postId}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| postId    |Integer   | **Required**. Fetch Post based on the PostId|

#### Get all the changes based on postId only for Admin Panel

```http
  GET http://127.0.0.1:8080/audit/post/{postId}
```
| Parameter | Type     | Description                                    |
| :-------- | :------- |:-----------------------------------------------|
| postId    |Integer   | **Required**. Fetch Changes based on the PostId|

## Authors

- [@sushantanandy](https://www.linkedin.com/in/sushantanandy/)