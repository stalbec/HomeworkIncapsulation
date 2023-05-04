import java.time.LocalDate;

public class Car {
    private String name;
    private String manufacturersCountry;
    private LocalDate dateOfManufacture;
    private String typeOfCar;

    public Car(String name, String manufacturersCountry, LocalDate dateOfManufacture, String typeOfCar) {
        this.name = name;
        this.manufacturersCountry = manufacturersCountry;
        this.dateOfManufacture = dateOfManufacture;
        this.typeOfCar = typeOfCar;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturersCountry() {
        return manufacturersCountry;
    }

    public void setManufacturersCountry(String manufacturersCountry) {
        this.manufacturersCountry = manufacturersCountry;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacturersCountry='" + manufacturersCountry + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", typeOfCar='" + typeOfCar + '\'' +
                '}';
    }
}
