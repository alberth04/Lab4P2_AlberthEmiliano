package lab4p2_albertthgodoy_emiliano_agurcia;

/**
 *
 * @author emili
 */
public abstract class Pieza {

    private char cordX;
    private char cordY;
    private boolean colorPieza;
    //Constructores
    public Pieza() {
    }

    public Pieza(char cordX, char cordY, boolean colorPieza) {
        this.cordX = cordX;
        this.cordY = cordY;
        this.colorPieza = colorPieza;
    }

    public Pieza(boolean colorPieza) {
        this.colorPieza = colorPieza;
    }

    

    public char getCordX() {
        return cordX;
    }

    public void setCordX(char cordX) {
        this.cordX = cordX;
    }

    public char getCordY() {
        return cordY;
    }

    public void setCordY(char cordY) {
        this.cordY = cordY;
    }

    @Override
    public String toString() {
        return "Pieza{" + "cordX=" + cordX + ", cordY=" + cordY + '}';
    }

    public abstract boolean validarMovimiento();
    
    public abstract char Figura(boolean colorPieza);

}
