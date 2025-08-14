package ru.arkhipov.MySecondTestAppSrpringBoot.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    public String toString() {
        return "{" +
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", course='" + source + '\'' +
                ", communicationId=" + communicationId +
                ", templateId=" + templateId +
                ", productCode=" + productCode +
                ", smsCode=" + smsCode +
                '}';
    }

    @NotBlank(message = "UID обязателен")
    @Size(max = 32, message = "UID не должен превышать 32 символа")
    private String uid;

    @NotBlank(message = "OperationUid обязателен")
    @Size(max = 32, message = "OperationUid не должен превышать 32 символа")
    private String operationUid;

    private Systems systemName;
    @NotBlank(message = "SystemTime обязателен")
    private String systemTime;

    private String source;
    @Min(value = 1, message = "CommunicationId должен быть не менее 1")
    @Max(value = 100000, message = "CommunicationId должен быть не более 100000")
    private int communicationId;

    private int templateId;
    private int productCode;
    private int smsCode;
}