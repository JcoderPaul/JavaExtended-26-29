package Less_27_ch_1_Serialization.MyClasses;
/*
Класс помечен, как Serializable, чтобы дать нам возможность
передать информацию об объекте в файл. Без подписки на данный
интерфейс у нас просто не будет возможности работать с классами
ObjectOutputStream и ObjectInputStream.
*/
import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String car_model;
    private String car_color;

    public Car(String car_model, String car_color) {
        this.car_model = car_model;
        this.car_color = car_color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(car_model, car.car_model) &&
               Objects.equals(car_color, car.car_color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car_model, car_color);
    }

    @Override
    public String toString() {
        return "Car: {" +
                "car_model= '" + car_model + '\'' +
                ", car_color= '" + car_color + '\'' +
                '}';
    }

    public String getCar_model() {
        return car_model;
    }

    public String getCar_color() {
        return car_color;
    }
}
