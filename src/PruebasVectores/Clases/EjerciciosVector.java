package PruebasVectores.Clases;

public class EjerciciosVector {

    public double[] vector;

    public EjerciciosVector(double[] vector){

        this.vector = vector.clone();
    }

    public void duplicarValores() throws Exception {
        //multiplica valores por 2
        if (vector.length==0) {
            throw new Exception("El vector no esta iniciado");
        }
            for (int i = 0; i < vector.length; i++) {
                vector[i] = vector[i * 2];

        }
    }


    public double obtenerMaximo() throws Exception {

        if (vector.length==0) {
            throw new Exception("El vector no esta iniciado");
        }
        double maximo = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]> maximo){
                maximo = vector[i];
            }
        }
        return maximo;
    }

    public boolean contieneValor(double valor) throws Exception {
        boolean resultado=false;
        int i=0;
        if (vector.length==0) {
            throw new Exception("El vector no esta iniciado");
        }
        while(!resultado && i<vector.length){
            if (vector[i] == valor){
                resultado = true;
            }
            i++;
        }
        return resultado;
    }
}
