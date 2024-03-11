package listes;
import java.util.ArrayList;
import java.util.List;

public class CreationListe {
    public static void main(String[] args) {
        List<Integer> nombre = new ArrayList<>();
        for (int i=1; i<100;i++) {
            nombre.add(i);
        }
        System.out.println(nombre.size());

    }
}
