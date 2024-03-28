package ControllerLab3;


import ModelLab3.Human;
import ModelLab3.Student;

public class StudentCreator {
    int ID = 0;

    public Student createStudent(Human person, int studentId) {


        Student student = new Student();
        student.setFirstName(person.getFirstName());
        student.setLastName(person.getLastName());
        student.setMiddleName(person.getMiddleName());

        student.setStudentId(studentId);
        student.setGender(person.getGender());

        return student;
    }

    public Student createTypicalStudent() {
        HumanCreator humanCreator = new HumanCreator();
        Human typicalPerson = humanCreator.createTypicalPerson();
        ID = ID + 1;
        Student typicalStudent = createStudent(typicalPerson, ID);
        return typicalStudent;
    }

}

