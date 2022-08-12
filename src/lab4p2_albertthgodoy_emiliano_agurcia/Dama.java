package lab4p2_albertthgodoy_emiliano_agurcia;

/**
 *
 * @author emili
 */
public class Dama extends Pieza {

    public Dama() {
    }

    public Dama(boolean colorPieza) {
        super(colorPieza);
    }

    public Dama(int cordX, int cordY, boolean colorPieza) {
        super(cordX, cordY, colorPieza);
    }

    @Override
    public boolean validarMovimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char Figura() {
        if (colorPieza == true) {
            return 'Q';
        } else {
            return 'q';
        }
    }

}
