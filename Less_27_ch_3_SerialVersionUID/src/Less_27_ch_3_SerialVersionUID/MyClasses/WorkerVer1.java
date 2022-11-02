package Less_27_ch_3_SerialVersionUID.MyClasses;

import java.io.Serializable;
import java.util.Objects;

public class WorkerVer1 implements Serializable {
    static final long serialVersionUID = 1;
    private String worker_name;
    private int worker_age;
    private int worker_experience;
    private double worker_salary;
    private String worker_department;

    public WorkerVer1(String worker_name, int worker_age,
                      int worker_experience, double worker_salary,
                      String worker_department) {
        this.worker_name = worker_name;
        this.worker_age = worker_age;
        this.worker_experience = worker_experience;
        this.worker_salary = worker_salary;
        this.worker_department = worker_department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkerVer1 worker = (WorkerVer1) o;
        return worker_age == worker.worker_age &&
               worker_experience == worker.worker_experience &&
               Double.compare(worker.worker_salary, worker_salary) == 0 &&
               Objects.equals(worker_name, worker.worker_name) &&
               Objects.equals(worker_department, worker.worker_department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worker_name, worker_age, worker_experience, worker_salary, worker_department);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "worker_name='" + worker_name + '\'' +
                ", worker_age=" + worker_age +
                ", worker_experience=" + worker_experience +
                ", worker_salary=" + worker_salary +
                ", worker_department='" + worker_department + '\'' +
                '}';
    }

    public String getWorker_name() {
        return worker_name;
    }

    public int getWorker_age() {
        return worker_age;
    }

    public int getWorker_experience() {
        return worker_experience;
    }

    public double getWorker_salary() {
        return worker_salary;
    }

    public String getWorker_department() {
        return worker_department;
    }
}
