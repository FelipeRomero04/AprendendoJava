package ExerciciosOOP.MainCEV;


import java.util.Map;

import static ExerciciosOOP.ClassCEV.ex003Class.printGradeStudent;

public class ex003Main {
    public static void main(String[] args) {
        Map<String, String> studentGrade = printGradeStudent(true, 10,4,6,4,3);
        System.out.println(studentGrade);
    }
}
