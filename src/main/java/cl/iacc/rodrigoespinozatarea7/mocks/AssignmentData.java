package cl.iacc.rodrigoespinozatarea7.mocks;

import cl.iacc.rodrigoespinozatarea7.entity.Assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rodrigo Espinoza
 */
public class AssignmentData {

    private final List<Assignment> assignmentList;

    public AssignmentData() {
        this.assignmentList = new ArrayList<>();
    }

    public Assignment add(Assignment assignment) {
        assignmentList.add(assignment);
        return assignment;
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public Assignment get(Long id) {
        return assignmentList.stream().filter(assignment -> assignment.getId().equals(id)).findFirst().get();
    }

    public List<Assignment> getAll() {
        return assignmentList;
    }

    public void delete(Long id) {
        this.assignmentList.remove(get(id));
    }


    /**
     * This method calculates the next id for the assignments
     * @return A long value with the next valid ID
     */
    public Long getNextId() {
        Long maxId = 0L;
        // for each assignment get the actual id and compare it with the maxId
        for (Assignment assignment : assignmentList) {
            Long actualId = assignment.getId();
            if (actualId > maxId) {
                maxId = actualId;
            }
        }
        return maxId + 1;
    }
}
