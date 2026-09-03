package Ejercicio2_vino;

public class vino {
    String etiqueta;
    String varietal;
    double precio;
    int stockBotellas;

    public vino(String etiqueta, String varietal, double precio, int stockBotellas) {
        if (stockBotellas <0) {
            throw new IllegalArgumentException("El stock de botellas no puede ser negativo.");
        }
        this.etiqueta = etiqueta;
        this.varietal = varietal;
        this.precio = precio;
        this.stockBotellas = stockBotellas;
    }

    public boolean venderBotellas(int cantidad) {
        if (cantidad <= stockBotellas) {
            stockBotellas -= cantidad;
            return true;
        }
        return false;
    }

    public void reponerStock(int cantidad) {
        if(cantidad<0){
            throw new IllegalArgumentException("La cantidad a reponer no debe ser negativa.");
        }
        stockBotellas += cantidad;
    }
    }


