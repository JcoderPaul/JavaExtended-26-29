package Less_26_HW_Examples.FileForRead;

import java.util.Objects;

public class PublicToPrivate {
    public String nameOfClass;
    public int intOfClass;

    public PublicToPrivate(String nameOfClass, int intOfClass) {
        this.nameOfClass = nameOfClass;
        this.intOfClass = intOfClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublicToPrivate that = (PublicToPrivate) o;
        return intOfClass == that.intOfClass &&
               Objects.equals(nameOfClass, that.nameOfClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfClass, intOfClass);
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public int getIntOfClass() {
        return intOfClass;
    }

    @Override
    public String toString() {
        return "PublicToPrivate: {" +
                "nameOfClass='" + nameOfClass + '\'' +
                ", intOfClass=" + intOfClass +
                '}';
    }
}
