import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      /*  University, School, Car жана Person деген класс тузунуз

        Алардын свойстваларын ойлоп табыныз

        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек

        Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз

        Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз*/

    Person person1 = new Person("Rasul","Alibaev", LocalDate.of(1986,5,10),'M');
    Person person2 = new Person("Aziza","Ablaeva", LocalDate.of(1992,1,28),'F');
    Person person3 = new Person("Musa","Isakov", LocalDate.of(1996,4,15),'F');
    Person person4 = new Person("Feruza","Alieva", LocalDate.of(1990,12,3),'M');
    Person[] persons = {person1,person2,person3,person4};
        for (Person per:persons) {
            System.out.println(per.toString());
        }

        System.out.println("==================================================================================================");

    University university1 = new University("Kyrgyz National University","Bishkek city, Kievskaya street,195", LocalDate.of(1932,5,12),"Nurlan Abasov");
    University university2 = new University("Kyrgyz Economic University","Bishkek city, Frunze street,56", LocalDate.of(1950,3,15),"Aijan Musaeva");
    University university3 = new University("Finance Technical University","Bishkek city, Bokonbaeva street,72", LocalDate.of(1970,8,6),"Samat Arpachiev");
    University university4 = new University("Acadamy of Finance and Business","Bishkek city, Belorusskaya street,12", LocalDate.of(1948,5,12),"Nurjamal Kutueva");
    University[] universities = {university1,university2,university3,university4};
        for (University u:universities) {
            System.out.println(u.toString());
        }

        System.out.println("===================================================================================================");
    School school1 = new School("School num 69","Bishkek city,Sovetskaya street,24",LocalDate.of(1976,8,23),"Nurlan Kupeshev");
    School school2 = new School("School num 5","Bishkek city,Masalieva street,124",LocalDate.of(1984,2,28),"Lena Turlova");
    School school3 = new School("School num 23","Bishkek city,Gorkaya street,55",LocalDate.of(1965,7,12),"Farhat Alishev");
    School school4 = new School("School num 39","Bishkek city,Usenbaeva street,24",LocalDate.of(1984,5,10),"Artem Olegov");
    School[] schools = {school1,school2,school3,school4};
        for (School school:schools) {
            System.out.println(school.toString());
        }

        System.out.println("===================================================================================================");
    Car car1 = new Car("Tesla, Model X","USA",LocalDate.of(2022,8,12),"Sedan");
    Car car2 = new Car("Audi, A4","Germany",LocalDate.of(2016,5,18),"Sedan");
    Car car3 = new Car("Nissan March","Japan",LocalDate.of(2003,11,23),"Cupe");
    Car car4 = new Car("Kia Rio","Korea",LocalDate.of(2020,9,8),"Sedan");
    Car[] cars = {car1,car2,car3,car4};
        for (Car car:cars) {
            System.out.println(car.toString());
        }

    }
}