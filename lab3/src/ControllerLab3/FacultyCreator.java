package ControllerLab3;
import ModelLab3.Department;
import ModelLab3.Faculty;
import ModelLab3.Human;

import java.util.ArrayList;
import java.util.List;

public class FacultyCreator {

    Faculty createFaculty(int departmentCount, int maxDepartments, Human dean) {
        Faculty faculty = new Faculty();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < departmentCount; i++) {
            departments.add(departmentCreator.createTypicalDepartment());
        }

        faculty.setDepartments(departments);
        faculty.setMaxDepartments(maxDepartments);
        faculty.setDean(dean);
        return faculty;
    }

    Faculty createTypicalFaculty() {
        HumanCreator humanCreator = new HumanCreator();
        Faculty faculty = createFaculty(2, 3, humanCreator.createTypicalPerson());
        return faculty;
    }
}