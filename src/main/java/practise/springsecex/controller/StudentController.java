package practise.springsecex.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import practise.springsecex.model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<Student>(
            List.of(
                    new Student(1, "Aysel", 65),
                    new Student(2, "Gunel", 70)
            )
    );

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;

    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/post-students")
    public Student addStudents(@RequestBody Student student) {
        students.add(student);
        return student;

    }
}
