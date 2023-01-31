public class ejercicio25 {
    public static void main(String[] args) {
    int cont=0;
    String texto = "CarTDFeeaji";
    String textoMa = texto.toUpperCase();
    char[] texto1=texto.toCharArray();
    char[] texto1M=textoMa.toCharArray();
    for(int i=0;i<texto1.length;i++){
        if(texto1[i]==texto1M[i]){
            cont++;

        }

        }
        if(cont>(texto1.length/2)){
            System.out.println(texto.toUpperCase());
        }else{
            System.out.println(texto.toLowerCase());
        }

    }
}