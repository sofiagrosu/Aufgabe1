public class Calculator {
    public boolean verifyGrade (int n){
        if (n>=0 && n<=100){
            return true;
        } else {
            return false;
        }
    }
    public int roundGrade (int n){
        if (n<38){
            return n;
        } else {
            int r = n % 5;
            if (r>=3){
                return n+(5-r);
            } else {
                return n;
            }
        }
    }
    public boolean passingGrade(int n){
        return n>=40;
    }

}
