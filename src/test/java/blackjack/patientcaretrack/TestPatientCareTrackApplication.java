package blackjack.patientcaretrack;

import org.springframework.boot.SpringApplication;

public class TestPatientCareTrackApplication {

    public static void main(String[] args) {
        SpringApplication.from(PatientCareTrackApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
