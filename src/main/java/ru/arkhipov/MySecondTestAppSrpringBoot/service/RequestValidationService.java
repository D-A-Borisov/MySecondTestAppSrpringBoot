package ru.arkhipov.MySecondTestAppSrpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.arkhipov.MySecondTestAppSrpringBoot.exception.UnsupportedCodeException;
import ru.arkhipov.MySecondTestAppSrpringBoot.exception.ValidationFailedException;

@Service
public class RequestValidationService implements ValidationService {
    public void isValid(BindingResult bindingResult) throws ValidationFailedException{
        if(bindingResult.hasErrors()){
            throw new
                    ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }

    public void isUnsupported(String uid) throws UnsupportedCodeException{
        if ("123".equals(uid)) {
            throw new UnsupportedCodeException("UID не может быть 123");
        }
    }
}