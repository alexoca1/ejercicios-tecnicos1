public class Ejercicio24 {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {1,2,7,4,5};
        boolean permutar = true;
        for (int i = 0; i < n; i++) {
            int m=i+1;
            if ((m)!=a[i]) {
                //System.out.println(a[i]+"---"+m);
                permutar = false;
                break;
            }

        }
        System.out.println("el array es permutado:" + permutar);
    }
}