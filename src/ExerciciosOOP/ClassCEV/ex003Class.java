package ExerciciosOOP.ClassCEV;

import java.util.*;

public class ex003Class {
    private static void validGrade(double... grade) {
        for (double n : grade) {
            if (n > 10 || n < 0) {
                throw new IllegalArgumentException("Somente valores entre 0 e 10 são permitidos.");
            }
        }
    }

    public static Map<String, String> printGradeStudent(boolean sit, double... grade) {
        Map<String, String> schoolGrade = new LinkedHashMap<>();
        validGrade(grade);

        schoolGrade.put("Total", String.valueOf(grade.length));
        double maxGrade = Arrays.stream(grade).max().orElse(0);
        double minGrade = Arrays.stream(grade).min().orElse(0);

        schoolGrade.put("Highest Grade", String.valueOf(maxGrade));
        schoolGrade.put("Lowest Grade", String.valueOf(minGrade));

        OptionalDouble line = Arrays.stream(grade).average();
        double average = 0;
        if (line.isPresent()) average = line.getAsDouble();

        schoolGrade.put("Average", String.valueOf(average));

        if (sit) {
            if (average > 7) {
                schoolGrade.put("Situation", "Great");
            } else if (average > 5) {
                schoolGrade.put("Situation", "Regular");
            } else {
                schoolGrade.put("Situation", "Bad");
            }
        }

        return schoolGrade;
    }
}


