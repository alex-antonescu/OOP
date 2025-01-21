package elemente;

import java.util.Objects;

public class Patrat extends Punct{
    private Punct coltStangaSusO;
    private Punct coltStangajosP;
    private double latura;
    private double arie;

    public Patrat(int x1, int y1, int x2, int y2) {
        coltStangaSusO = new Punct();
        coltStangajosP = new Punct();
        this.coltStangaSusO.x = x1;
        this.coltStangaSusO.y = y1;
        this.coltStangajosP.x = x2;
        this.coltStangajosP.y = y2;
        this.latura = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        this.arie = Math.pow(latura, 2);
    }

    @Override
    public String toString() {
        return "Patrat - O(" + coltStangaSusO.x + "," + coltStangaSusO.y + ")" + ", latura = " + latura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patrat patrat)) return false;
        return Double.compare(arie, patrat.arie) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(arie);
    }
}
