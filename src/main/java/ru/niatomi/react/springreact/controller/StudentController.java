package ru.niatomi.react.springreact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.niatomi.react.springreact.model.domain.Student;

import java.util.List;

/**
 * @author niatomi
 */
@RestController
@RequestMapping("/students")
public interface StudentController {

    @GetMapping
    List<Student> getAllStudent();

}
