import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        System.out.println(action("z"));
        System.out.println(action("zdqmwpbs"));
        System.out.println(action("zzzzs"));
        System.out.println(action("wwwwwwz"));

    }

    private static String action(String msg) {
        Map<String, Integer> right = new HashMap<>();
        right.put("m", 4);
        right.put("q", 3);
        right.put("d", 2);
        right.put("z", 1);

        Map<String, Integer> left = new HashMap<>();
        left.put("w", 4);
        left.put("p", 3);
        left.put("b", 2);
        left.put("s", 1);

        int sumRight = 0;
        int sumLeft = 0;

        for (int i = 0; i < msg.length(); i++) {
            if (right.containsKey(msg.substring(i, i + 1))) {
                sumRight += right.get(msg.substring(i, i + 1));
            } else if (left.containsKey(msg.substring(i, i + 1))) {
                sumLeft += left.get(msg.substring(i, i + 1));
            }
        }

        int div = sumLeft - sumRight;

        if (div > 0) {
            return "Left side wins!";
        } else if (div < 0) {
            return "Right side wins!";
        } else {
            return "Let's fight again!";
        }

    }

}
