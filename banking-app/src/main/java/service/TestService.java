package service;

import dto.PatientDetailsRequest;
import org.springframework.stereotype.Component;

@Component
public interface TestService {

    String fetchProductDetails(String productName);

    String registerPatient(PatientDetailsRequest patientDetailsRequest);

}
