package com.uniqueusernameannotation.uniqueusernameannotation.annotations;

import com.uniqueusernameannotation.uniqueusernameannotation.model.User;
import com.uniqueusernameannotation.uniqueusernameannotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        User user = userRepository.findByUsername(s);
        return user == null;
    }

}
