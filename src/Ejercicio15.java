public class Ejercicio15 {

    public static void main(String[] args) {
        String texto = "buensosdias.geraaaa";
        char[] texto1;
        String texto2="aeiou";
        char[] texto3;
        int cont = 0;
        int max = 0;
        char a='a';

        texto1 = texto.toCharArray();
        texto3=texto2.toCharArray();
        for (char c : texto1) {
            char v=c;


        for(int i=0;i<texto3.length;i++) {
            if (v == texto3[i]) {
                cont++;
            }
        }
        }
        System.out.println("cantidad de vocales: "+cont);
    }
}

