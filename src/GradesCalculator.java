import java.util.ArrayList;
import java.util.List;

public class GradesCalculator {
    private Calculator calculator = new Calculator();
    private void VerifyGrades(List<Integer> grades){
        for(int grade : grades){
            if(!calculator.verifyGrade(grade)){
                throw new IllegalArgumentException("Invalid grade: " + grade);
            }
        }
    }
    public List<Integer> selectNotPassingGrades(List<Integer> grades){
        VerifyGrades(grades);
       List<Integer> result = new ArrayList<Integer>();
        for(int grade : grades){
            if(!calculator.passingGrade(grade)){
                result.add(grade);
            }
        }
        return result;
    }
    public List<Integer> roundGrades(List<Integer> grades){
        VerifyGrades(grades);
        List<Integer> result = new ArrayList<Integer>();
        for(int grade : grades){
            result.add(calculator.roundGrade(grade));
        }
        return result;
    }
    public float averageOfGrades(List<Integer> grades){
        VerifyGrades(grades);
        grades = roundGrades(grades);
        if(grades.isEmpty()){
            return 0;
        }
        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return (float)sum / grades.size();
    }
    public int maxGrade(List<Integer> grades){
        VerifyGrades(grades);
        if(grades.isEmpty()){
            return 0;
        }
        grades = roundGrades(grades);
        int max = grades.get(0);
        for(int grade : grades){
            if(grade > max){
                max = grade;
            }
        }
        return max;
    }
}
