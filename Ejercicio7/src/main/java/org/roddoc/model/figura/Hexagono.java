package org.roddoc.model.figura;

import org.roddoc.util.ReadUtil;
import org.roddoc.vista.Menu;

public class Hexagono extends Figura {
    private double lado;

    public Hexagono() {
    }

    public Hexagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return (3 * Math.sqrt(3) / 2) * (lado * lado);
    }

    @Override
    public double perimetro() {
        return 6 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void leeDatos() {
        Menu.leeLadoH();
        lado = ReadUtil.readInt();
    }
}
