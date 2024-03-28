package ControllerLab3;
import ModelLab3.Human;
import ModelLab3.Faculty;
import ModelLab3.University;
import java.util.ArrayList;
import java.util.List;

public class UniversityCreator {


    public   University createUniversity(String name, int facultyCount, Human president) {
        University university = new University();
        FacultyCreator facultyCreator = new FacultyCreator();
        university.setName(name);
        university.setHead(president);
        List<Faculty> faculties = new ArrayList<>();
        for (int i = 1; i < facultyCount; i++) {
            faculties.add(facultyCreator.createTypicalFaculty());
        }
        university.setFaculties(faculties);

        return university;

    }

    public  University createTypicalUniversity() {
        HumanCreator humanCreator = new HumanCreator();
        University university = createUniversity("Dnipro University of Technology", 3, humanCreator.createTypicalPerson());

        return university;
    }

}
