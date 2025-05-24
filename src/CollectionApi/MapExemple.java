package CollectionApi;

import java.util.HashMap;
import java.util.Map;

public class MapExemple {

    public static void main(String[] args){

        Map<String, Integer> students = new HashMap<>();

        students.put("Ali",15);
        students.put("Sonia",16);
        students.put("Ahmed",18);
        students.put("Med",15);
        students.put("Ali",17);

        System.out.println(students);
        System.out.println(students.get("Ali"));
        System.out.println(students.keySet());
    }

}
