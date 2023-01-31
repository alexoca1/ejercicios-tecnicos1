public class Ejercicio16
{
    public static void main(String[] args) {
        String a="Buzz";
        String b="Lightyear";
        String c=a+b;

        int n=25;

        for(int i=1;i<=25;i++){
            if(i%3==0){
                System.out.println(a);
            }
            if(i%5==0){
                System.out.println(b);
            }
            if((i%3==0) && (i%5==0)){
                System.out.println(c);
            }
            else{
                System.out.println(i);
            }

        }



    }
}
