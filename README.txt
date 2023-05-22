# Employee Manager REST API

Employee Manager is a simple REST API project that allows users to manage employee data using Spring Boot and MySQL database. The API provides a set of endpoints for creating, updating, and deleting employee records, and includes features such as search and filtering capabilities, security, and error handling.

## Getting Started

To get started with this project, you will need to have Java and Maven installed on your system, as well as a MySQL database. Once you have downloaded the project files, you can run the application using the Maven command `mvn spring-boot:run`. This will start the application and launch it in your default web browser, where you can easily manage employee records using API endpoints.

## API Endpoints

The Employee Manager API provides the following endpoints:

- GET: http://localhost:8080//employee/all - retrieve a list of all employees
- GET: http://localhost:8080//employees/find/{id} - retrieve an employee by ID
- POST: http://localhost:8080//employees/add - create a new employee
- PUT: http://localhost:8080/employees - update an existing employee
- DELETE: http://localhost:8080/employees/delete/{id} - delete an employee by ID


## Error Handling and Logging

The Employee Manager API includes error handling and logging capabilities, allowing for easy debugging and maintenance. Errors are logged to the console and to a log file for easytroubleshooting.

## Conclusion

Overall, the Employee Manager API is a great starting point for anyone interested in learning how to build simple and efficient REST API applications using Spring Boot and MySQL database. Whether you are a beginner or an experienced developer, this project provides a solid foundation and can be easily extended to meet your specific requirements. With its user-friendly API endpoints and robust features, this project is a valuable resource for anyone looking to manage employee data efficiently and effectively through an API.