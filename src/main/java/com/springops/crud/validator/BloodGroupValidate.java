package com.springops.crud.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BloodGroupValidate implements ConstraintValidator<BloodGroup,String> {

	@Override
	public void initialize( BloodGroup bloodgrp) {
	}
	@Override
	public boolean isValid(String bloodgrp, ConstraintValidatorContext context) {		
		System.out.println(bloodgrp);
		return  bloodgrp != null && bloodgrp.toUpperCase().matches("(A|B|AB|O)[+-]") && (bloodgrp.length()<=3);
	}
}
