package PruebasProducto.Clases;

public class Producto {
    public static final int LONG_MIN = 1;
    public static final int LONG_MAX = 10;

    private String descripcion;
    private double precio;

    public Producto(String descripcion, double precio) throws Exception {
       setDescripcion(descripcion);
       setPrecio(precio);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) throws Exception {

        if (descripcion.length()>LONG_MAX || descripcion.length()<LONG_MIN) {
            throw new Exception("La Longitud de la descripción no es correcta");
        }
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws Exception {

        if (precio<1) {
            throw new Exception("El precio introducido debe ser mayor que 0");
        }
        this.precio = precio;
    }
}
