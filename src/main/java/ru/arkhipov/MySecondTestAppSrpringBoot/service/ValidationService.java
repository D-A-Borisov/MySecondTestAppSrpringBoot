package ru.arkhipov.MySecondTestAppSrpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.arkhipov.MySecondTestAppSrpringBoot.exception.UnsupportedCodeException;
import ru.arkhipov.MySecondTestAppSrpringBoot.exception.ValidationFailedException;

import javax.naming.Binding;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;

    void isUnsupported(String uid) throws UnsupportedCodeException;
}