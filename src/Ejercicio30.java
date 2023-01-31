import java.util.*;

import static java.util.Arrays.sort;

public class Ejercicio30 {
    public static void main(String[] args) {

       Object n[]={1,2,3,4,"hola",'D',2,2,1,2,3,4};
       ArrayList<Integer> ent=new ArrayList<Integer>();
       int cont=0;

        for(int i=0;i<n.length;i++) {
            //System.out.println(n[i].getClass().getSimpleName());
            if (n[i].getClass().getSimpleName().equals("Integer")) {
                String e = n[i].toString();
                int d = Integer.parseInt(e);
                ent.add(d);
            }
        }
            for(int i=0;i<ent.size();i++){


            }

            Collections.sort(ent);
            ArrayList<Integer> entero=new ArrayList<Integer>();

               entero.add(ent.get(0));
            for(int i=1;i<ent.size()-1;i++)
                if(ent.get(i)!=ent.get(i+1)){
                        entero.add(ent.get(i+1));


                    }



        System.out.println(entero);
        }


        }


