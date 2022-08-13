package lab4p2_albertthgodoy_emiliano_agurcia;

/**
 *
 * @author emili
 */
public class Peon extends Pieza {

    public Peon() {
    }

    public Peon(boolean colorPieza) {
        super(colorPieza);
    }

    public Peon(int cordX, int cordY, boolean colorPieza) {
        super(cordX, cordY, colorPieza);
    }

    @Override
    public char Figura() {
        if (colorPieza == true) {
            return 'P';
        } else {
            return 'p';
        }
    }

    @Override
    public boolean validarMovimiento(int movActualX, int movActualY, int movPiezaX, int movPiezaY) {
        //Validacion peon
        if (this.isColorPieza()) {
            if (movPiezaX == movActualX && movPiezaY == movActualY) {
                return false;
            }

        }
        return true;
    }

}
