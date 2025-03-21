package org.SolanoRojasGabriel.inicio;

import org.SolanoRojasGabriel.util.ReadUtil;
import org.SolanoRojasGabriel.vista.Consola;
import org.SolanoRojasGabriel.vista.Ejecutable;
import org.SolanoRojasGabriel.vista.Menu;
import org.SolanoRojasGabriel.vista.Ventana;

/**
 * 
 */
public class Inicio {

    /**
     * Default constructor
     */
    public Inicio() {
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        while( flag )
        {
            Menu.principal2( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );
            switch ( opcion )
            {
                case 1:
                    ejecutable = Consola.getInstance( );
                    break;
                case 2:
                    ejecutable = Ventana.getInstance( );
                    break;
                case 3:
                    flag = false;
                    ejecutable = null;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( ejecutable != null )
            {
                ejecutable.run( );
            }
        }


    }

}