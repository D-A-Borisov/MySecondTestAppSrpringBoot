package ru.arkhipov.MySecondTestAppSrpringBoot.service;

import org.springframework.stereotype.Service;
import ru.arkhipov.MySecondTestAppSrpringBoot.model.Response;

@Service
public interface ModifyResponseService {

    Response modify(Response response);
}