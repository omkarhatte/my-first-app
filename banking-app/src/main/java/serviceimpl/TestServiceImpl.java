package serviceimpl;

import dto.PatientDetailsRequest;
import org.springframework.stereotype.Service;
import service.TestService;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String fetchProductDetails(String productName) {
        if (productName != null) {
            switch (productName) {
                case "Boat":
                    return "good quality";
                case "Noise":
                    return "better than boat";
                case "skullcandy":
                    return "avg quality";
                default:
                    return "out of stock";

            }
        } else {
            return "product can't be null";
        }
    }

    @Override
    public String registerPatient(PatientDetailsRequest patientDetailsRequest) {
        return null;
    }
}