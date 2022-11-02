package Less_27_ch_2_SerializationTransient.MyClasses;

import java.io.Serializable;
import java.util.Objects;

public class Hero implements Serializable {
    private String hero_name;
    private int hero_age;
    private transient double hero_power;
    private transient Weapon hero_weapon;

    public Hero(String hero_name, int hero_age, double hero_power, Weapon hero_weapon) {
        this.hero_name = hero_name;
        this.hero_age = hero_age;
        this.hero_power = hero_power;
        this.hero_weapon = hero_weapon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return hero_age == hero.hero_age &&
               Double.compare(hero.hero_power, hero_power) == 0 &&
               Objects.equals(hero_name, hero.hero_name) &&
               Objects.equals(hero_weapon, hero.hero_weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hero_name, hero_age, hero_power, hero_weapon);
    }

    @Override
    public String toString() {
        return "Hero: {" +
                "hero_name= '" + hero_name + '\'' +
                ", hero_age= " + hero_age +
                ", hero_power= " + hero_power +
                ", hero_weapon= " + hero_weapon +
                '}';
    }

    public String getHero_name() {
        return hero_name;
    }

    public int getHero_age() {
        return hero_age;
    }

    public double getHero_power() {
        return hero_power;
    }

    public Weapon getHero_weapon() {
        return hero_weapon;
    }
}
