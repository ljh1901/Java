package java104;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private String name;
    //  Generic 형태로 문자열을 받는 subjects 선언
    private Set<String> subjects;

    public Student(String name) {
        this.name = name;
        subjects = new HashSet<>();
    }
    // name의 getter
    public String getName() {
        return name;
    }

    // subjects의 getter
    public Set<String> getSubjects() {
        return subjects;
    }

    //과목을 담는 method
    public void addSubject(String subject) {
        subjects.add(subject);
    }
    
}