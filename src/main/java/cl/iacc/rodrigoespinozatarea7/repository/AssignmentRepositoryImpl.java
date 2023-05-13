package cl.iacc.rodrigoespinozatarea7.repository;

import cl.iacc.rodrigoespinozatarea7.mocks.AssignmentData;
import cl.iacc.rodrigoespinozatarea7.entity.Assignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AssignmentRepositoryImpl implements AssignmentRepository {

    final AssignmentData assignmentData;

    @Autowired
    public AssignmentRepositoryImpl(AssignmentData assignmentData) {
        this.assignmentData = assignmentData;
    }

    @Override
    public Assignment create(Assignment assignment) {
        assignment.setId(assignmentData.getNextId());
        return assignmentData.add(assignment);
    }

    @Override
    public Assignment findById(Long id) {
        return assignmentData.get(id);
    }

    @Override
    public List<Assignment> findAll() {
        return assignmentData.getAll();
    }

    @Override
    public void remove(Long id) {
        assignmentData.delete(id);
    }
}
