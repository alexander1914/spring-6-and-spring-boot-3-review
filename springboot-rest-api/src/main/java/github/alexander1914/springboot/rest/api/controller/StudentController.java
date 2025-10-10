package github.alexander1914.springboot.rest.api.controller;

import github.alexander1914.springboot.rest.api.bens.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @RestController: is an annotation that s a specialized version of the controller.
/// It includes the @Controller and @ResponseBody annotations, and as a result, simplifies the controller implementation.
/// @RequestMapping is an annotation that Spring MVC maps incoming HTTP requests to controller methods.
/// It works with the DispatcherServlet, which routes requests to the correct handler.
@RestController
@RequestMapping("students")
public class StudentController {

    /// @GetMapping is an annotation that used to map HTTP GET requests to a specific handler method in a controller,
    /// acting as a shortcut for @RequestMapping(method = RequestMethod. GET)
    @GetMapping("student")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(
                1,
                "Alexander",
                "Oliveira"
        );
        /// ResponseEntity s the class in the Spring Framework that represents the entire HTTP response,
        /// including the status code, headers, and body.
        return ResponseEntity.ok()
                .header("custom-header", "alexander")
                .body(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alexander", "Oliveira"));
        students.add(new Student(2, "Vivian", "Less"));
        students.add(new Student(3, "Bruna", "Carlos"));
        students.add(new Student(4, "Ericka", "Alvar's"));

        return ResponseEntity.ok(students);
    }

    /// @PathVariable is an annotation that extracts values from URI templates in HTTP requests.
    /// It enables dynamic path segments in URLs to be mapped to method parameters in controller methods
    /// {id} - URI template variable
    @GetMapping("{id}")
    public ResponseEntity<Student> studentPathVariable(@PathVariable("id") int studentId){
        Student student = new Student(studentId, "Alexander", "Oliveira");
        return ResponseEntity.ok(student);
    }

    ///@RequestParam is an annotation that enables Spring to extract input data that may be passed as a query,
    /// form data or any arbitrary custom data.
    @GetMapping("query")
    public ResponseEntity<Student> studentRequestParam(@RequestParam int id,
                                       @RequestParam String firstName,
                                       @RequestParam String lastName){
        Student student =  new Student(id, firstName, lastName);
        return ResponseEntity.ok(student);
    }

    /// @PostMapping in an annotation that Spring annotation that is used to map HTTP POST,
    ///  requests onto specific handler methods.
    /// It is a shortcut for @RequestMapping annotation with method = RequestMethod. POST attribute
    /// @RequestBody is an annotation that typically used with GET methods to write the response body content.
    /// @ResponseStatus is an annotation that control HTTP responses in Spring applications.
    @PostMapping("create")
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> postRequestCreate(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());

        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    /// @PutMapping is an annotation that Spring annotation that is used to map,
    ///  HTTP PUT requests onto specific handler methods.
    /// It is a shortcut for @RequestMapping annotation with (method = RequestMethod. PUT) attribute.
    @PutMapping("{id}/update")
    public ResponseEntity<Student> putRequestUpdate(@RequestBody Student student, @PathVariable("id") int studentId){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());

        return ResponseEntity.ok(student);
    }

    /// @DeleteMapping is an annotation that  is used to map HTTP DELETE requests onto specific handler methods.
    /// It is a shortcut for @RequestMapping annotation with (method = RequestMethod. DELETE) attribute.
    @DeleteMapping("{id}/delete")
    public ResponseEntity<String> deleteRequestDelete(@PathVariable("id") int studentId){
        System.out.println(studentId);
        return ResponseEntity.ok("Student deleted successfully");
    }
}
