package org.SolanoRojasGabriel.model.figura;

import org.SolanoRojasGabriel.util.ReadUtil;
import org.SolanoRojasGabriel.vista.Menu;

public class Circulo extends Figura {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * (radio * radio);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void leeDatos() {
        Menu.leeRadio();
        // Se usa readInt() para mantener consistencia, aunque radio es double.
        radio = ReadUtil.readInt();
    }
}
