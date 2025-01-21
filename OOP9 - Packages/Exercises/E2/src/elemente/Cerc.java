package elemente;

import java.util.Objects;

public class Cerc extends Punct {
    private Punct origineO;
    private int raza;

    public Cerc(int x, int y, int raza) {
        origineO = new Punct(x, y);
        origineO.x = x;
        origineO.y = y;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Cerc - O(" + origineO.x + "," + origineO.y + ")" + ", r = " + raza;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cerc cerc = (Cerc) o;
        return raza == cerc.raza && Objects.equals(origineO, cerc.origineO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origineO, raza);
    }
}
