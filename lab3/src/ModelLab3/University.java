package ModelLab3;

import java.util.List;
import java.util.Objects;

public class University {
    private String universityName;
    private Human head;
    private List<Faculty> faculties;

    public String getName() {
        return universityName;
    }

    public void setName(String universityName) {
        this.universityName = universityName;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + universityName + '\'' +
                ", president=" + head +
                ", faculties=" + faculties +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        University that = (University) o;
        return Objects.equals(universityName, that.universityName) &&
                Objects.equals(head, that.head) &&
                Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(universityName, head, faculties);
    }
}
