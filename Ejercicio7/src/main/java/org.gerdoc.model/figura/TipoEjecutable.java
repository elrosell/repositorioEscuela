package org.gerdoc.model.figura;

import org.gerdoc.historial.Historia;
import org.gerdoc.vista.Consola;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.Ventana;


public enum TipoEjecutable {
    CONSOLA(1, Consola.getInstance()),
    VENTANA(2, Ventana.getInstance()),
    SALIR(3, null),
    OPCION_ERRONEA(4, null),
    HISTORIAL(5, null),
    CONSOLA_GABRIEL(6, org.SolanoRojasGabriel.vista.Consola.getInstance()),
    VENTANA_GABRIEL(7, Ventana.getInstance()),
    CONSOLA_DANIEL(8, org.roddoc.vista.Consola.getInstance()),
    VENTANA_DANIEL(9, org.roddoc.vista.Ventana.getInstance())
    ;
    private Integer id;
    private Ejecutable ejecutable;

    TipoEjecutable(Integer id, Ejecutable ejecutable) {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public Integer getId() {
        return id;
    }

    public static TipoEjecutable getTipoEjecutableById(int opcion) {
        switch (opcion) {
            case 1:
                return CONSOLA;
            case 2:
                return VENTANA;
            case 3:
                return HISTORIAL;
            case 4:
                return CONSOLA_GABRIEL;
            case 5:
                return CONSOLA_DANIEL;
            case 6:
                return VENTANA_GABRIEL;
            case 7:
                return VENTANA_DANIEL;
            case 8:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }

    public Ejecutable getEjecutable() {
        return ejecutable;
    }
}