package Less_27_ch_3_SerialVersionUID.SerializedClass;
/*

*/
import java.io.Serializable;
import java.util.Objects;

public class Worker implements Serializable {
    static final long serialVersionUID = 2;
    private String worker_name;
    private String worker_surname;
    private int worker_age;
    private double worker_salary;
    private String worker_department;

    public Worker(String worker_name, String worker_surname,
                  int worker_age, double worker_salary,
                  String worker_department) {
        this.worker_name = worker_name;
        this.worker_surname = worker_surname;
        this.worker_age = worker_age;
        this.worker_salary = worker_salary;
        this.worker_department = worker_department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return worker_age == worker.worker_age &&
               Double.compare(worker.worker_salary, worker_salary) == 0 &&
               Objects.equals(worker_name, worker.worker_name) &&
               Objects.equals(worker_surname, worker.worker_surname) &&
               Objects.equals(worker_department, worker.worker_department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worker_name, worker_surname, worker_age, worker_salary, worker_department);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "worker_name='" + worker_name + '\'' +
                ", worker_surname='" + worker_surname + '\'' +
                ", worker_age=" + worker_age +
                ", worker_salary=" + worker_salary +
                ", worker_department='" + worker_department + '\'' +
                '}';
    }

    public String getWorker_name() {
        return worker_name;
    }

    public String getWorker_surname() {
        return worker_surname;
    }

    public int getWorker_age() {
        return worker_age;
    }

    public double getWorker_salary() {
        return worker_salary;
    }

    public String getWorker_department() {
        return worker_department;
    }
}
