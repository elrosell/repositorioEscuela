package org.SolanoRojasGabriel.model.figura;

import org.SolanoRojasGabriel.vista.SolicitaDatos;

/**
 * 
 */
public abstract class Figura extends org.gerdoc.model.figura.Figura implements SolicitaDatos
{

    /**
     * Default constructor
     */


    public Figura()
    {
    }

    /**
     * @return
     */
    public abstract double area( );

    /**
     * @return
     */
    public abstract double perimetro();
}