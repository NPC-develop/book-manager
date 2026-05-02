图书管理系统

基于 Spring Boot + MyBatis + MySQL 的图书管理后端 API

技术栈
Java 17
Spring Boot 3.x
MyBatis
MySQL 8.x

核心功能
图书增删改查
RESTful API 设计

快速运行
创建数据库 `book_db`
修改 `application.yml` 中的数据库密码
运行 `DemoApplication.java`
访问 `http://localhost:8080/api/books`

API 示例
| 方法 | 路径              | 功能        |
|------|-------------------|-------------|
| GET  | /api/books        | 查所有      |
| GET  | /api/books/{id}   | 查单个      |
| POST | /api/books        | 新增        |
| PUT  | /api/books        | 修改        |
| DELETE | /api/books/{id} | 删除        |
