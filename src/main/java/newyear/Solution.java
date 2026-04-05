package newyear;

public class Solution {
    public static void main(String[] args) {
        int score = 75;
        String grade = "";
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 75 && score <= 89) {
            grade = "B";
        } else if (score >= 60 && score <= 74) {
            grade = "C";
        } else if (score < 60) {
            grade = "F";
        } else {
            System.out.println("Введен неверный балл");
        }
        System.out.println("Ваша оценка: "+grade);
    }
}
