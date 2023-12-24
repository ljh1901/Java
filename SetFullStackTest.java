package java104;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class SetFullStackTest {
    public static void main(String[] args) {
        String[] arrSubject = { "Java", "Python", "Java", "Algorithm", "Spring", "Data structure", "Java Script",
                "DataBase", "Lamda", "Spring", "Spring Boot" };

        System.out.println(Arrays.toString(arrSubject));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // SmartA (학생) object를 생성, subject을 추가
        Student s1 = new Student("SmartA");
        s1.addSubject("Java");
        s1.addSubject("Algorithm");
        s1.addSubject("Python");
        s1.addSubject("Spring");

        // SmartB (학생) object를 생성, subject을 추가
        Student s2 = new Student("SmartB");
        s2.addSubject("Java");
        s2.addSubject("DataBase");
        s2.addSubject("Spring");

        // SmartC (학생) object를 생성, subject을 추가
        Student s3 = new Student("SmartC");
        s3.addSubject("Java");
        s3.addSubject("Spring");
        s3.addSubject("Javascript");

        // Course object를 생성, 학생 추가
        Course course = new Course();
        course.setStudents(s1, s2, s3);

        System.out.println("[1] 모든 교과목을 출력");
        course.setSubjects(arrSubject);
        Set<String> subjects = course.getSubjects();
        Course.print(subjects);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[2] 정렬된 교과목을 출력");
        List<String> oSubjects = course.getOrderSubjects();
        Course.print(oSubjects);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println("[3] 모든 학생들이 수강중인 모든 교과목을 출력(Union)");
        Set<String> uSubjects = course.getRegisteredSubjects();
        Course.print(uSubjects);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[4] 모든 학생들이 수강 중인 과목 (Intersection)");
        Set<String> iSubjects = course.getBasicSubjects();
        Course.print(iSubjects);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[5] 모든 학생들이 수강하지 않는 과목 (Complete)");
        Set<String> cSubjects = course.getCancelSubjects();
        Course.print(cSubjects);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
