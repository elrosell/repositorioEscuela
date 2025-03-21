package org.roddoc.model.figura;

public enum FiguraEnum
{
    CUADRADO(1),
    EQUILATERO(2),
    ISOSCELES(3),
    ESCALENO(4),
    HEXAGONO(5),
    RECTANGULO(6),
    ROMBOIDE(7),
    CIRCULO(8),
    SALIR(9),
    OPCION_ERRONEA(0);
    private Integer tipo;

    FiguraEnum(Integer tipo)
    {
        this.tipo = tipo;
    }

    public Integer getTipo()
    {
        return tipo;
    }

    public static FiguraEnum getFiguraEnumById( Integer id )
    {
        switch( id )
        {
            case 1:
                return CUADRADO;
            case 2:
                return EQUILATERO;
            case 3:
                return ISOSCELES;
            case 4:
                return ESCALENO;
            case 5:
                return HEXAGONO;
            case 6:
                return RECTANGULO;
            case 7:
                return ROMBOIDE;
            case 8:
                return CIRCULO;
            case 9:
                return SALIR;
            default:
                return OPCION_ERRONEA;

        }
    }
}