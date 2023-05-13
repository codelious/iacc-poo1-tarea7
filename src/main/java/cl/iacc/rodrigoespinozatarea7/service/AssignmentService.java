package cl.iacc.rodrigoespinozatarea7.service;

import cl.iacc.rodrigoespinozatarea7.entity.Assignment;

import java.util.List;

public interface AssignmentService {
    Assignment create(Assignment assignment);
    Assignment findById(Long id);
    List<Assignment> findAll();
    void remove(Long id);
}
