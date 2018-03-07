/*
 * esta clase dibuja triángulos

 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Jorge Cisneros
 */
public class Heptagono extends Forma {

    public Heptagono(int _posX, int _posY, Color _color, boolean _relleno) {
        //inicializa el constructor del triángulo correctamente para que guarde 3 lados
        super(_posX, _posY, 7, _color, _relleno);
    }

}
