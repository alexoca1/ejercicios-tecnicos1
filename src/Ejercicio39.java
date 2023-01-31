import java.util.stream.IntStream;

public class Ejercicio39 {
    public static void main(String[] args) {

        String email="emn.er@hotm.ail.com";
        char emailv[]=email.toCharArray();
        boolean punto=false;
        int contPunto=0;
        boolean arroba=false;
        int contArroba=0;

        for(int i=0;i<emailv.length;i++){
            if(emailv[i]=='@'){
                contArroba++;
                arroba=true;
            }
            if(emailv[i]=='.'){
                punto=true;
                contPunto++;
            }
        }
        int maxPunto=0,a=0;
        for(int i=0;i<emailv.length;i++){
            if(emailv[i]=='.'){
                maxPunto=i;
            }
           a=maxPunto;
        }

        int b=email.indexOf('@');

        if(arroba && punto && (a>b) && (contArroba==1) && (contPunto>0)){
            System.out.println("el email es valido");
        }
        else{
            System.out.println("el email no es valido");
        }
    }
}
