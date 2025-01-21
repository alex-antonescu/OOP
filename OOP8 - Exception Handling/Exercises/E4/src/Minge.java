public class Minge {
    private int X;
    private int Y;
    private CoordinateGenerator coordinateGenerator = new CoordinateGenerator();


    public Minge() {
        X = 50;
        Y = 25;
    }

    public Minge(int x, int y){
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public void suteaza() throws Out, Gol, Corner {
        this.X = coordinateGenerator.generateX();
        this.Y = coordinateGenerator.generateY();

        if (Y == 0 || Y == 50) {
            throw new Out();
        }

        if (X == 0 || X == 100) {
            if (Y >= 20 && Y <= 30) {
                throw new Gol();
            }
        }

        if (X == 0 || Y == 100) {
            if (0 < Y && Y < 20 || 30 < Y && Y < 50) {
                throw new Corner();
            }
        }

    }
}
