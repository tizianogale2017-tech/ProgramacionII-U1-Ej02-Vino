package Ejercicio2_vino;

public class Main {
    public static void main(String[] args) {
        vino malbec = new vino("Malbec", "Malbec", 250.50, 100);
        malbec.venderBotellas(10);
        malbec.reponerStock(20);
        System.out.println("Stock actual de botellas: " + malbec.stockBotellas);
    }
}
