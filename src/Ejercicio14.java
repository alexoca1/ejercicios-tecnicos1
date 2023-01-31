public class Ejercicio14 {
    public static void main(String[] args) {
        String texto="buensosdias.ger";
        char[] texto1;

        int cont=0;
        int max=0;
        texto1=texto.toCharArray();
        char letraMasRepetida=texto1[0];
        for(char c:texto1){
            for(char r:texto1){
                if(c==r){
                    cont++;

                }

            }
            if(cont>max){
                max=cont;
                letraMasRepetida=c;
            }
            cont=0;
        }
        System.out.println("letra mas repetida= "+letraMasRepetida);
    }
}
