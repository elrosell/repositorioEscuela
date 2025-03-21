package org.SolanoRojasGabriel.util;

import org.SolanoRojasGabriel.model.figura.*;
import org.SolanoRojasGabriel.model.figura.figura2.Escaleno;
import org.SolanoRojasGabriel.model.figura.figura2.Isosceles;

public class FiguraFactory
{

    public static Figura getFiguraByFiguraEnum(FiguraEnum figuraEnum )
    {
        return switch (figuraEnum) {
            case CUADRADO -> new Cuadrado();
            case ESCALENO -> new Escaleno();
            case ISOSCELES -> new Isosceles();
            case EQUILATERO -> new Equilatero();
            case HEXAGONO -> new Hexagono();
            case RECTANGULO -> new Rectangulo();
            case ROMBOIDE -> new Romboide();
            case CIRCULO -> new Circulo();
            default -> null;
        };
    }
}
