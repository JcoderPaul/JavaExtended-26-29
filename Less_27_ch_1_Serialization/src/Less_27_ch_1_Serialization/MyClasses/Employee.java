package Less_27_ch_1_Serialization.MyClasses;
/*
Класс помечен, как Serializable, чтобы дать нам возможность
передать информацию об объекте в файл. Без подписки на данный
интерфейс у нас просто не будет возможности работать с классами
ObjectOutputStream и ObjectInputStream.
*/
import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

    private String name_emp;
    private String department;
    private int age;
    private double salary;
    private Car emp_car;

    public Employee(String name_emp, String department, int age, double salary, Car car) {
        this.name_emp = name_emp;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.emp_car = car;
    }

    @Override
    public String toString() {
        return "Employee: {" +
                "name_emp= '" + name_emp + '\'' +
                ", department= '" + department + '\'' +
                ", age= " + age +
                ", salary= " + salary +
                ", emp_car= " + emp_car +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
               Double.compare(employee.salary, salary) == 0 &&
               Objects.equals(name_emp, employee.name_emp) &&
               Objects.equals(department, employee.department) &&
               Objects.equals(emp_car, employee.emp_car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name_emp, department, age, salary, emp_car);
    }

    public String getName_emp() {
        return name_emp;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
