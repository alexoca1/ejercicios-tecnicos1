import java.util.ArrayList;
import java.util.List;

public class ejemplo44 {
    public static void main(String[] args) {
        String[] texto = {"Hola amigo", "si", "no", "tal vez"};
        List<String> doble=new ArrayList<>();
        for (String e : texto) {
            for (int i = 0; i < e.length(); i++) {
                char[] en = e.toCharArray();
                if (en[i] == ' ') {
                        doble.add(e);
                }

            }
        }
        System.out.println(doble);
    }}
