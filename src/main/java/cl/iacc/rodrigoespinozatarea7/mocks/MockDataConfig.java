package cl.iacc.rodrigoespinozatarea7.mocks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockDataConfig {

    @Bean
    public EmployeeData employeeDataBean() {
        return new EmployeeData();
    }

    @Bean
    public LaptopData notebookDataBean() {
        return new LaptopData();
    }

    @Bean
    public AssignmentData assignmentDataBean() {
        return new AssignmentData();
    }
}
