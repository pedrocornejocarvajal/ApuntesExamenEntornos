package PruebasVariadas.principal;

public class Selectiva {
    public int minimo = 0;

    public int obtenerMaximo(int x, int y) {
        int máximo = x;
        if (máximo < y)
            máximo = y;
        return máximo;
    }

    public void actualizarMinimo(int x) {
        if (minimo > x)
            minimo = x;
    }

    public void restaurarMinimoPositivo() {
        if (minimo < 0)
            minimo = 0;
    }

    public void multiplicacionPorSigno(){
        if(minimo < 0){
            minimo *= -2;
        }
        else {
            minimo *= 3;
        }
    }

    public int realizarCalculo(int opcion, int a, int b) {
        int cálculo;
        switch (opcion) {
            case 0:
                cálculo = a + b;
                break;
            case 1:
                cálculo = a * b;
                break;
            default:
                cálculo = -1;
        }
        return cálculo;
    }
}
