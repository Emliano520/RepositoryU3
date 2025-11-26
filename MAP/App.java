import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "Mouse");
        map.put(2, "Teclado");
        map.put(0, "USB");
        map.put(3, "Botoncito");
        map.put(1, "Mouse Gamer");
        map.put(10, "test");

        System.out.println(map);
        String value = map.get(3);
        System.out.println(value);

        boolean exist = map.containsKey(10);
        System.out.println("Existe l KEY 10?" + exist);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("La key es:" + entry.getKey() + "El valor es:" + entry.getValue());
        }

        int size = map.size();
        System.out.println("El tamaño es:" + size);

    }

}
