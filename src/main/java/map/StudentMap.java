package map;

import java.util.HashMap;
import java.util.Set;

public class StudentMap {

    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<Student,String>();

        map.put(new Student("xiaoming",3),"xiaoming");
        map.put(new Student("Rose",5),"love");
        map.put(new Student("Baby",10),"huangxiaoming");
        map.put(new Student("Peiqi",5),"xiaozhu");
        map.put(new Student("Peiqi",5),"xiaozhu");


        Set<Student> set = map.keySet();

        for(Student student:set){
            System.out.println(student + " " +map.get(student));
        }
    }
}
