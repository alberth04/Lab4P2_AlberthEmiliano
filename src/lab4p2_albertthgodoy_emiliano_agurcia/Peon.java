package lab4p2_albertthgodoy_emiliano_agurcia;

/**
 *
 * @author emili
 */
public class Peon extends Pieza{

    public Peon() {
    }

    public Peon(boolean colorPieza) {
        super(colorPieza);
    }

    public Peon(int cordX, int cordY, boolean colorPieza) {
        super(cordX, cordY, colorPieza);
    }
    

    @Override
    public boolean validarMovimiento() {
        return true;
    }

    @Override
    public char Figura() {
        if (colorPieza == true) {      
            return 'P';
        } else {
            return 'p';
        }
    }
    
}
