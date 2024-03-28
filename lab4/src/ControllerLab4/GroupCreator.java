package ControllerLab4;

import ModelLab4.Group;
import ModelLab4.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupCreator {


    Group createGroup(int studentCount, int maxCapacity) {
        Group group = new Group();
        StudentCreator studentCreator = new StudentCreator();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(studentCreator.createTypicalStudent());
        }
        group.setStudents(students);
        group.setMaxCapacity(maxCapacity);
        return group;
    }

    Group createTypicalGroup() {
        Group group = createGroup(3, 10);
        return group;
    }

}
