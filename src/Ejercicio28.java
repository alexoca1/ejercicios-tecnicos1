public class Ejercicio28 {
    public static void main(String[] args) {
        Integer n=2201022;
       String n1=n.toString();
       char[] inv=n1.toCharArray();
       boolean cop=true;
       for(int i=0;i<inv.length;i++){
           if(inv[i]!=inv[inv.length-i-1]){
               cop=false;
               break;
           }

       }
        System.out.println("el numero es cupicua: "+cop);
    }
}
