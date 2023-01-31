public class ejercicio41 {
    public static void main(String[] args) {
       int numero=10;
        int num;
        num=numero;


        int t=1;
        for(int i=1;i<=numero-1;i++){
            t=t+2;
        }

        int m=t/2;
        System.out.println(m);
      for(int q=1;q<=t;q++){

          if(q==(m+1)){
              System.out.print("*");
          }else{
              System.out.print(" ");
          }

      }
        System.out.println();
     for(int i=2;i<=numero;i++){
         int cont = 0;
         for(int l=1;l<=m+1-i;l++){
             cont++;
             System.out.print(" ");

         }
         for(int j=1;j<=t-cont*2;j++){

             System.out.print("*");
           }


         System.out.println();
        }



        }

    }

