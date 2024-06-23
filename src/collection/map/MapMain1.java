package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("StudentA", 90);
        studentMap.put("StudentB", 80);
        studentMap.put("StudentC", 90);
        studentMap.put("StudentD", 70);
        System.out.println("studentMap = " + studentMap);

        // 특정 학생의 값 조회
        Integer result = studentMap.get("StudentA");
        System.out.println("result = " + result);

        System.out.println("KeySet 활용");
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
//            System.out.println("key = " + key);
            Integer integer = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + integer);
        }

        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }
    }
}
