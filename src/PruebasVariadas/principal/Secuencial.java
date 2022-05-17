package PruebasVariadas.principal;

public class Secuencial {
    public int contador;

    public int sumar(int x, int y){
        return x+y;
    }

    public void setContador(int contador){
        this.contador = contador;
    }

    public int getContador(){
        return contador;
    }

    public double calcularMedia(double a, double b){
        return (a+b)/2;
    }
}
