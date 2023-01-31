public class Ejercicio13 {
    public static void main(String[] args) {
        int arreglo[] = {2, 4, 5, 6, 7, 65, 32, 1, 2, 3, 4, 5};
        int sub = 3, div;
        div = (arreglo.length +1)/ sub;
        System.out.println(div);


        System.out.print("[ ");
        for (int i = 0; i < (arreglo.length); i = i + div) {
            //System.out.print("("+i+")");
            int[] arreglo1 = new int[div ];

            for (int j = 0; j < div-1; j++) {
               //System.out.println(j+i+" "+arreglo[j+i]);
                arreglo1[j] = arreglo[j+i];
              //  System.out.println(arreglo[j]);
            }
            System.out.print("[");
                for (int t = 0; t < sub; t++) {

                    if (t != (sub - 1)) {
                        System.out.print(arreglo1[t] + ",");
                    } else {
                        System.out.print(arreglo1[t]);
                    }
                }
                System.out.print("]");
            }
            System.out.print("]");
        }
    }
