public class Ejercicio27 {
    public static void main(String[] args) {
        int n=920;
        int anios;
        int meses;
        int dias;

        anios=920/365;
        System.out.print("anios: "+anios);
        meses=(920%365)/30;
        System.out.print(", meses "+meses);
        dias=920-2*365-30*meses;
        System.out.print(", dias "+dias);
    }
}
