package org.roddoc.model.figura;

import org.roddoc.util.ReadUtil;
import org.roddoc.vista.Menu;

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
