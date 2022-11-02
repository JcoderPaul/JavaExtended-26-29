package Less_27_ch_2_SerializationTransient.MyClasses;

import java.io.Serializable;
import java.util.Objects;

public class Weapon implements Serializable {
    private String name_of_weapon;
    private transient double power_of_weapon;

    public Weapon(String name_of_weapon, double power_of_weapon) {
        this.name_of_weapon = name_of_weapon;
        this.power_of_weapon = power_of_weapon;
    }

    @Override
    public String toString() {
        return "Weapon: {" +
                "name_of_weapon= '" + name_of_weapon + '\'' +
                ", power_of_weapon= " + power_of_weapon +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapon weapon = (Weapon) o;
        return Double.compare(weapon.power_of_weapon, power_of_weapon) == 0 &&
               Objects.equals(name_of_weapon, weapon.name_of_weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name_of_weapon, power_of_weapon);
    }

    public String getName_of_weapon() {
        return name_of_weapon;
    }

    public double getPower_of_weapon() {
        return power_of_weapon;
    }
}
