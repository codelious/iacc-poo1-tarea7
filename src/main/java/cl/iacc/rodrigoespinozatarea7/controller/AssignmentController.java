package cl.iacc.rodrigoespinozatarea7.controller;

import cl.iacc.rodrigoespinozatarea7.dto.AssignmentDTO;
import cl.iacc.rodrigoespinozatarea7.entity.Assignment;
import cl.iacc.rodrigoespinozatarea7.entity.Employee;
import cl.iacc.rodrigoespinozatarea7.entity.Laptop;
import cl.iacc.rodrigoespinozatarea7.service.AssignmentService;
import cl.iacc.rodrigoespinozatarea7.service.EmployeeService;
import cl.iacc.rodrigoespinozatarea7.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/assignment")
public class AssignmentController {

    final AssignmentService assignmentService;
    final EmployeeService employeeService;
    final LaptopService laptopService;

    @Autowired
    public AssignmentController(AssignmentService assignmentService, EmployeeService employeeService, LaptopService laptopService) {
        this.assignmentService = assignmentService;
        this.employeeService = employeeService;
        this.laptopService = laptopService;
    }

    @PostMapping
    public ResponseEntity<Assignment> create(@RequestBody AssignmentDTO assignmentDTO) {
        // find the employee
        String employeeId = assignmentDTO.getEmployeeId();
        Employee employee = employeeService.findById(employeeId);

        // find the device
        String laptopSerial = assignmentDTO.getLaptopSerial();
        Laptop laptop = laptopService.findById(laptopSerial);

        // prepare the new assignment setting the employee and laptop
        Assignment assignment = new Assignment();
        assignment.setDate(assignmentDTO.getDate());
        assignment.setEmployee(employee);
        assignment.setLaptop(laptop);

        // call the service to save the new assignment
        Assignment createdAssignment = assignmentService.create(assignment);

        // return the created assignment
        return new ResponseEntity<>(createdAssignment, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Assignment> getById(@PathVariable Long id) {
        return new ResponseEntity<>(assignmentService.findById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Assignment>> getAll() {
        return new ResponseEntity<>(assignmentService.findAll(), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id) {
        assignmentService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
