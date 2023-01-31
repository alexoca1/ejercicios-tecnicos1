public class ejemplo46 {
    public static void main(String[] args) {
        String texto = "hola";
        char[] texto1 = texto.toCharArray();

        for (int i = 0; i < texto1.length; i++) {

            for (int j = 0; j < texto1.length - i; j++) {


                for (int q = j; q < texto1.length - i; q++) {

                    System.out.print(texto1[q]);

                }
                System.out.print(" ,");
            }

            System.out.println("\nfin");
        }
    }
}
