import java.util.Arrays;

public class ejercicio11 {
    public static void main(String[] args) {
        String texto;
        texto = "la vida, hay .que vivirla como la vida";
        String cen="vida";
        int cont=0;
        String texto1[];
        texto=texto.replace(","," ");
        texto=texto.replace("."," ");
        texto=texto.replace(";"," ");
        texto1=texto.split(" ");
        System.out.println(texto);
        for (String  c:texto1) {
            if(c.equals(cen)){
                System.out.println("=====================");
                texto=texto.replace(cen,"-censure-");
                 cont++;
            }


            }
        if(cont==0){

            System.out.println("la palabra no esta");
        }
        System.out.println(texto);
       }

        }


