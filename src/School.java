import java.time.LocalDate;

public class School {
    private String name;
    private String address;
    private LocalDate dateOfFoundation;
    private String directorsFullName;

    public School(String name, String address, LocalDate dateOfFoundation, String directorsFullName) {
        this.name = name;
        this.address = address;
        this.dateOfFoundation = dateOfFoundation;
        this.directorsFullName = directorsFullName;
    }

    public School() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(LocalDate dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }

    public String getDirectorsFullName() {
        return directorsFullName;
    }

    public void setDirectorsFullName(String directorsFullName) {
        this.directorsFullName = directorsFullName;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dateOfFoundation=" + dateOfFoundation +
                ", directorsFullName='" + directorsFullName + '\'' +
                '}';
    }
}
