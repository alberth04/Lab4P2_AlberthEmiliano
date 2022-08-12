package lab4p2_albertthgodoy_emiliano_agurcia;

/**
 *
 * @author emili
 */
public abstract class Pieza {

    private int cordX;
    private int cordY;
    protected boolean colorPieza;
    private Tablero tablero;

    //Constructores
    public Pieza() {
    }

    public Pieza(int cordX, int cordY, boolean colorPieza) {
        this.cordX = cordX;
        this.cordY = cordY;
        this.colorPieza = colorPieza;
    }

    public Pieza(boolean colorPieza) {
        this.colorPieza = colorPieza;
    }

    public int getCordX() {
        return cordX;
    }

    public void setCordX(int cordX) {
        this.cordX = cordX;
    }

    public int getCordY() {
        return cordY;
    }

    public void setCordY(int cordY) {
        this.cordY = cordY;
    }

    public boolean colorPieza() {
        return colorPieza;
    }

    @Override
    public String toString() {
        return "Pieza{" + "cordX=" + cordX + ", cordY=" + cordY + '}';
    }

    public abstract boolean validarMovimiento(int movActualX, int movActualY, int movPiezaX, int movPiezaY);

    public abstract char Figura();

}
