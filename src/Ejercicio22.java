import java.util.Locale;

public class Ejercicio22 {
    public static void main(String[] args) {
        String c="texto correcto vamos pues";
        char[] b=c.toCharArray();

       // String[] d=c.split(" ");

     //   String palabra=d[0].toUpperCase();
    //   System.out.println(palabra);
        System.out.print(String.valueOf(b[0]).toUpperCase());
        for(int i=0;i<b.length;i++){
            if(b[i]==' '){
                char valor=b[i+1];
               String d=String.valueOf(valor).toUpperCase();

                b[i+1]=d.charAt(0);
               // System.out.println(b[i+1]);
            }

        }
    for(int i=1;i<b.length;i++){
        System.out.print(b[i]);


    }
    }
}
