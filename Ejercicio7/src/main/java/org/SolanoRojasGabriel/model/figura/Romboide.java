package org.SolanoRojasGabriel.model.figura;

import org.SolanoRojasGabriel.util.ReadUtil;
import org.SolanoRojasGabriel.vista.Menu;

public class Romboide extends Figura {
    private double base;
    private double altura;

    public Romboide() {
    }

    public Romboide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void leeDatos() {
        Menu.leeBaseRomboide();
        base = ReadUtil.readInt();
        Menu.leeAlturaRomboide();
        altura = ReadUtil.readInt();
    }
}
