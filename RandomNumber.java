

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println(getScoreResult());
    }
    static String  getScoreResult(){
        String grade = "";
        Random rnd = new Random();
        int random_number = rnd.nextInt(100);
        if (random_number > 80){
            grade  = "A";
        }else if (random_number > 60){
            grade  = "B";
        }else if (random_number > 40){
            grade  = "C";
        }else if (random_number > 20){
            grade  = "D";
        }else {
                grade  = "E";
        }
        return "Your score is " + random_number + " and your grade is " + grade;
    }
}
