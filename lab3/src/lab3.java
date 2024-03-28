import ModelLab3.University;
import ControllerLab3.UniversityCreator;

public class lab3 {

    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println(university.toString());
    }

}
