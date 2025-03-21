package org.roddoc.historial;


import org.roddoc.model.figura.Figura;

public interface Historiales extends org.gerdoc.historial.Historiales
{
    void imprimir( );
    void addFigura(Figura figura );
}
