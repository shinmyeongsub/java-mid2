package collection.map;

import java.util.HashMap;

public class MapMain2 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100); // 같은 키로 저장하면 value가 덮어쓰기 됨
        System.out.println(studentMap);

        boolean result = studentMap.containsKey("studentA");
        System.out.println("result = " + result);

        // 특정 학생의 값 삭제
        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}
