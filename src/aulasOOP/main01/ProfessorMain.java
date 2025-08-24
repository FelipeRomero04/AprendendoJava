package aulasOOP.main01;

import aulasOOP.classe01.ImprimirProfessor;
import aulasOOP.classe01.ProfessorClass;

public class ProfessorMain {
    public static void main(String[] args){
        ProfessorClass teacher = new ProfessorClass();
        ProfessorClass teacherHighSchool = new ProfessorClass();
        ImprimirProfessor print = new ImprimirProfessor();
        teacher.name = "Roberto";
        teacher.age = 43;
        teacher.registration = "434523";

        teacherHighSchool.name = "Robinho";
        teacherHighSchool.age = 23;
        teacherHighSchool.registration = "234542324";

        print.printTeacher(teacher);
        print.printTeacher(teacherHighSchool);


    }
}


