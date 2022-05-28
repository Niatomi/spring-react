package ru.niatomi.react.springreact.model.domain;

import lombok.AllArgsConstructor;
import ru.niatomi.react.springreact.model.domain.enumerations.Gender;

import java.util.UUID;

/**
 * @author niatomi
 */
@AllArgsConstructor
public class Student {

    private final UUID studentId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;

}
