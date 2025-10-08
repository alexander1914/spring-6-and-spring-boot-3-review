package github.alexander1914.springboot.rest.api.controller;

import github.alexander1914.springboot.rest.api.bens.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @RestController: is an annotation that s a specialized version of the controller.
/// It includes the @Controller and @ResponseBody annotations, and as a result, simplifies the controller implementation.
@RestController
public class StudentController {

    /// @GetMapping is an annotation that used to map HTTP GET requests to a specific handler method in a controller,
    /// acting as a shortcut for @RequestMapping(method = RequestMethod. GET)
    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(
                1,
                "Alexander",
                "Oliveira"
        );

        return student;
    }

    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alexander", "Oliveira"));
        students.add(new Student(2, "Vivian", "Less"));
        students.add(new Student(3, "Bruna", "Carlos"));
        students.add(new Student(4, "Ericka", "Alvar's"));

        return students;
    }

    /// @PathVariable is an annotation that extracts values from URI templates in HTTP requests.
    /// It enables dynamic path segments in URLs to be mapped to method parameters in controller methods
    /// {id} - URI template variable
    @GetMapping("students/{id}")
    public Student studentPathVariable(@PathVariable("id") int studentId){
        return new Student(studentId, "Alexander", "Oliveira");
    }

    ///@RequestParam is an annotation that enables Spring to extract input data that may be passed as a query,
    /// form data or any arbitrary custom data.
    @GetMapping("students/query")
    public Student studentRequestParam(@RequestParam int id,
                                       @RequestParam String firstName,
                                       @RequestParam String lastName){
        return new Student(id, firstName, lastName);
    }

    /// @PostMapping in an annotation that Spring annotation that is used to map HTTP POST,
    ///  requests onto specific handler methods.
    /// It is a shortcut for @RequestMapping annotation with method = RequestMethod. POST attribute
    /// @RequestBody is an annotation that typically used with GET methods to write the response body content.
    /// @ResponseStatus is an annotation that control HTTP responses in Spring applications.
    @PostMapping("students/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student postRequestCreate(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());

        return student;
    }

    /// @PutMapping is an annotation that Spring annotation that is used to map,
    ///  HTTP PUT requests onto specific handler methods.
    /// It is a shortcut for @RequestMapping annotation with (method = RequestMethod. PUT) attribute.
    @PutMapping("students/{id}/update")
    public Student putRequestUpdate(@RequestBody Student student, @PathVariable("id") int studentId){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());

        return student;
    }
}
