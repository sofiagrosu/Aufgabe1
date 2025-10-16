import java.util.List;

public class Main {
    public static void main(String[] args) {
        GradesCalculator calculator = new GradesCalculator();
        List<Integer> grades = List.of(45, 67, 89, 90, 34, 76, 88, 92, 100, 54,23);
        List<Integer> grades1 = List.of(45, 67, 89, 90, 34, 76, 88, 93, 54,23);
        List<Integer> grades2 = List.of(45, 67, 89, 90, 34, 76, 88, 93, 54,23,-10);//invalid grade -10
        List<Integer> grades3 = List.of(45, 67, 89, 90, 34, 76, 88, 193, 54,23,-10);//invlalid grade 193
        System.out.println("Not passing grades: " + calculator.selectNotPassingGrades(grades));
        // System.out.println("Not passing grades: " + calculator.selectNotPassingGrades(grades2));//error: invalid grade
        System.out.println("Rounded grades: " + calculator.roundGrades(grades));
        System.out.println("Average of grades: " + calculator.averageOfGrades(grades));
        //  System.out.println("Average of grades: " + calculator.averageOfGrades(grades3));//error: invalid grade
        System.out.println("Max grade: " + calculator.maxGrade(grades));
        System.out.println("Max grade: " + calculator.maxGrade(grades1));//max out of rounded grades (95)

    }
}

