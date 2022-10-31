package controller;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import service.RegisterRequest;

public class RegisterRequestValidator implements Validator {

	private static final Pattern EMAIL_PATTERN = Pattern.compile(".+\\@.+\\..+");

	@Override
	public boolean supports(Class<?> clazz) {
		return RegisterRequest.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		RegisterRequest req = (RegisterRequest) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required");
		ValidationUtils.rejectIfEmpty(errors, "password", "required");

		if (req.isEmailNull()) {
			errors.rejectValue("email", "required");
		} else if (EMAIL_PATTERN.matcher(req.getEmail()).matches()) {
			errors.rejectValue("email", "bad");
		}

		if (req.isPasswordEqualToConfirmPassword() == false) {
			errors.rejectValue("confirmPassword", "nomatch");
		}
	}
}
