/*
 * esta clase dibuja triángulos

 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Jorge Cisneros
 */
public class Heneagono extends Forma {

    public Heneagono(int _posX, int _posY, Color _color, boolean _relleno) {
        //inicializa el constructor del triángulo correctamente para que guarde 3 lados
        super(_posX, _posY, 9, _color, _relleno);
    }

}
