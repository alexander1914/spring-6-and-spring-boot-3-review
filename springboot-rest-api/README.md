# RESTFull APIs
is stands for Representational State Transfer API it is a type of API (Application Programming Interface) that allows communication between different systems over the internet.

**REST APIs** work by sending requests and receiving responses, typically in JSON format, between the client and server.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Spring boot overview](https://spring.io/projects/spring-boot)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTFull Web Service](https://spring.io/guides/gs/rest-service/)
* [Microservices](https://spring.io/microservices)
* [Spring Academy](https://spring.academy/courses)

------------------------------------------------------------------------------------------------------------------------

**@RestController:** is an annotation that s a specialized version of the controller.
It includes the **@Controller** and **@ResponseBody** annotations, and as a result, simplifies the controller implementation.

**@GetMapping:** is an annotation that used to map HTTP GET requests to a specific handler method in a controller,
acting as a shortcut for **@RequestMapping**(method = RequestMethod. GET)

**@PathVariable** is an annotation that extracts values from URI templates in HTTP requests.
It enables dynamic path segments in URLs to be mapped to method parameters in controller methods.

**@RequestParam** is an annotation that enables Spring to extract input data that may be passed as a query, 
form data or any arbitrary custom data.

