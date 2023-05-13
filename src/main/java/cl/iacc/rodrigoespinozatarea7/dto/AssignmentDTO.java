package cl.iacc.rodrigoespinozatarea7.dto;

import java.time.LocalDate;

public class AssignmentDTO {

    private LocalDate date;
    private String employeeId;
    private String laptopSerial;

    public AssignmentDTO() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getLaptopSerial() {
        return laptopSerial;
    }

    public void setLaptopSerial(String laptopSerial) {
        this.laptopSerial = laptopSerial;
    }
}
