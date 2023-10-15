package pro.sky.homeWork18;

public class Employee {
    private final String firstName;
    private final String lastName;

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "Имя работника ='" + firstName + '\'' +
                "Фамилия работника ='" + lastName + '\'' +
                '}';
    }
}
