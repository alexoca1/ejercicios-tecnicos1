import java.util.Objects;

public class Ejercicio20 {
    public static void main(String[] args) {
        String n1="adertia";
        String n2="deraait";
        int cont=0;
       char[] t1=n1.toCharArray();
      char[]  t2=n2.toCharArray();
        if(t1.length==t2.length){
           for(int i =0;i<t2.length;i++){

               for(int j=0;j<t1.length;j++){
                //  char a=n1[i];
                //   char b=n2[j];
                  if(t1[i]==t2[j]){
                      t2[j]=' ';
                        cont++;


                 }

               }
           }

            if(cont==t1.length){
                System.out.println("es anagrama");
            }
            else{

                System.out.println("no es anagrama");
            }
        }
        else{
            System.out.println("no es un anagrama");

        }
    }
}