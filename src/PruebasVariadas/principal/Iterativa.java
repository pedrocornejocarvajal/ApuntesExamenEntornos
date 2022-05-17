package PruebasVariadas.principal;

public class Iterativa {
    private final int MINIMO_VALIDO = -100;
    private final int MAXIMO_VALIDO = 1000;

    public double[] datos;

    public Iterativa(double[] datos) {
        this.datos = datos;
    }


    public double buscarMáximo(double[] vector) {
        double máximo = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > máximo)
                máximo = vector[i];
        }
        return máximo;
    }

    public double buscarMinimoInterno() {
        double minimo = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] < minimo)
                minimo = datos[i];
        }
        return minimo;
    }

    public void duplicarValoresDatos() {
        for (int i = 0; i < datos.length; i++) {
            datos[i] *= 2;
        }
    }

    public double obtenerValorEntre(double minimo, double maximo) throws Exception {
        boolean encontrado = false;
        double valor = 0;
        int i = 0;
        while (i < datos.length && !encontrado) {
            if (datos[i] >= minimo && datos[i] <= maximo) {
                encontrado = true;
                valor = datos[i];
            }
            i++;
        }
        if (!encontrado)
            throw new Exception("No hay ningún número en el rango.");
        return valor;
    }

    public double obtenerPrimerNegativo(double x, double y) throws Exception {
        boolean encontrado = false;
        double valor = 0;
        int i = 0;
        while (i < datos.length && !encontrado) {
            if (datos[i] < 0) {
                encontrado = true;
                valor = datos[i];
            }
            i++;
        }
        if (!encontrado)
            throw new Exception("No hay ningún número negativo.");
        return valor;
    }

    public void verificarDatosInternos() throws Exception {
        int i = 0;
        while (i < datos.length) {
            if (datos[i] < MINIMO_VALIDO || datos[i] > MAXIMO_VALIDO) {
                throw new Exception("Dato fuera del rango permitido.");
            }
            i++;
        }
    }
}
