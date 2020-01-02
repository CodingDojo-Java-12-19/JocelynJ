package com.jocelyn.authentication.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.jocelyn.authentication.models.User;
import com.jocelyn.authentication.repositories.UserRepository;

@Component
public class UserValidator implements Validator {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		User user = (User)target;
		
		if(!user.getPasswordConfirmation().equals(user.getPassword())) {
			errors.rejectValue("passwordConfirmation", "Match", "Password and Password Confirmation must match");
		}
		
		if(this.userRepository.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "Unique", "Email address is already part of the database");
		}
		
		if(user.getEmail().isEmpty()) {
			errors.rejectValue("email", "No email", "Email field cannot be empty");
		}
		
		if(user.getPassword().isEmpty()) {
			errors.rejectValue("password", "No password", "Password field cannot be empty");
		}
	}
}