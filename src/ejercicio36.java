public class ejercicio36 {
    public static void main(String[] args) {
        String texto = "aeiouAEIOU";

        char t[] = texto.toCharArray();
        int conv = 0, conc;
        char vocal[] = {'a', 'e', 'i', 'o', 'u' };

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (t[i] == vocal[j]) {
                    conv++;
                    break;
                }
            }
            }
        conc=texto.length()-conv;
            System.out.println("vocales: " + conv + " , consonantes: " + conc);
        }
    }
