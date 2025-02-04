
# Production Ready Spring Boot Features

This project covers the basic SpringBoot appliaction having the below files:

1. A PostDTO
2. A PostEntity
3. Having a Post Repository
4. Have a Service interface 
5. Class which implement the Service interface known as PostServiceImpl
6. Having a Controller with below endPoints:
7. Gracefully handled the Error using the Advice 


## API Reference

#### Get all items

```http
  POST http://127.0.0.1:8080/posts
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `jSON body` | `string` | **Required** title and dsecription |

#### Get item

```http
  GET http://127.0.0.1:8080/posts
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| null      |          | **Required**. Fetch All the Posts |

```http
  GET http://127.0.0.1:8080/posts/{postId}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| postId    |Integer   | **Required**. Fetch Post based on the PostId|

## Authors

- [@sushantanandy](https://www.linkedin.com/in/sushantanandy/)