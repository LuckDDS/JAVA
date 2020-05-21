package com.dy.validator;

import com.dy.model.AyUser;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author DongDeShuai
 * @Date:2020/5/21 10:51 上午
 */
public class AyUserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return AyUser.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"name","name.empty");
        AyUser p = (AyUser) o;
        if (p.getAge() < 0){
            errors.rejectValue("age","年龄不能小于0岁");
        }else if(p.getAge() > 150){
            errors.rejectValue("age","年龄不能超过150");
        }

    }
}
