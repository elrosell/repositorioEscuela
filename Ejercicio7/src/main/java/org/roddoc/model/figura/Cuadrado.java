package org.roddoc.model.figura;

import org.roddoc.util.ReadUtil;
import org.roddoc.vista.Menu;

/**
 * 
 */
public class Cuadrado extends Figura
{

    private double lado;

    public Cuadrado()
    {
    }

    public Cuadrado(double lado)
    {
        this.lado = lado;
    }

    @Override
    public double area()
    {
        return lado*lado;
    }

    @Override
    public double perimetro()
    {
        return lado*4;
    }

    @Override
    public void leeDatos()
    {
        Menu.leeLado( );
        lado = ReadUtil.readInt( );
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}