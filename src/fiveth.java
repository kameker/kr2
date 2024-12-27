import java.util.*;

public class fiveth {
    public static Map<Integer, Integer> solve(List<Integer> list) {
        Map<Integer, Integer> result = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int k = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    k++;
                }
            }
            if (k > max) {
                max = k;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int k = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    k++;
                }
            }
            if (k == max) {
                result.put((Integer) list.get(i), i);
            }
        }
        return result;
    }

    public static void printMap(Map map) {
        System.out.println(map);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 7, 1, 3, 5, 1, 6, 1, 7, 7, 2, 5);
        Map<Integer, Integer> map = solve(list);
        printMap(map);

        List<Integer> list2 = Arrays.asList(4, 4, 4);
        Map<Integer, Integer> map2 = solve(list);
        printMap(map2);

        List<Integer> list3 = Arrays.asList(5, 4, 3);
        Map<Integer, Integer> map3 = solve(list);
        printMap(map3);

        List<Integer> list4 = Arrays.asList(100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100);
        Map<Integer, Integer> map4 = solve(list);
        printMap(map4);

        List<Integer> list5 = Arrays.asList(11, 10, 10, 11, 11, 11, 12, 11, 12, 10, 12, 11, 12, 12);
        Map<Integer, Integer> map5 = solve(list);
        printMap(map5);
    }
}
