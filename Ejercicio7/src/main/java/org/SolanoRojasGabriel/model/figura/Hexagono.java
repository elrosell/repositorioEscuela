package org.SolanoRojasGabriel.model.figura;

import org.SolanoRojasGabriel.util.ReadUtil;
import org.SolanoRojasGabriel.vista.Menu;

public class Hexagono extends Figura {
    private double lado;


    public Hexagono(double lado) {
        this.lado = lado;
    }

    public Hexagono() {

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
