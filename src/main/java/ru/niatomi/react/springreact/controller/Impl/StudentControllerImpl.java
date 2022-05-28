package ru.niatomi.react.springreact.controller.Impl;

import org.springframework.web.bind.annotation.RestController;
import ru.niatomi.react.springreact.controller.StudentController;
import ru.niatomi.react.springreact.model.domain.Student;
import ru.niatomi.react.springreact.model.domain.enumerations.Gender;

import java.util.List;
import java.util.UUID;

import static ru.niatomi.react.springreact.model.domain.enumerations.Gender.FEMALE;

/**
 * @author niatomi
 */
@RestController
public class StudentControllerImpl implements StudentController {
    @Override
    public List<Student> getAllStudent() {
        return List.of(

                new Student(UUID.randomUUID(),
                "firstName",
                "lastname",
                "example@example.org",

                FEMALE),
                new Student(UUID.randomUUID(),
                "firstName",
                "lastname",
                "example@example.org",
                FEMALE));

    }
}
