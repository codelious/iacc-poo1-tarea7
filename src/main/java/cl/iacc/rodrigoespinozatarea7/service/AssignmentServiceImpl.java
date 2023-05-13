package cl.iacc.rodrigoespinozatarea7.service;

import cl.iacc.rodrigoespinozatarea7.entity.Assignment;
import cl.iacc.rodrigoespinozatarea7.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentServiceImpl implements AssignmentService {

    final AssignmentRepository assignmentRepository;

    @Autowired
    public AssignmentServiceImpl(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }

    @Override
    public Assignment create(Assignment assignment) {
        return assignmentRepository.create(assignment);
    }

    @Override
    public Assignment findById(Long id) {
        return assignmentRepository.findById(id);
    }

    @Override
    public List<Assignment> findAll() {
        return assignmentRepository.findAll();
    }

    @Override
    public void remove(Long id) {
        assignmentRepository.remove(id);
    }


}
