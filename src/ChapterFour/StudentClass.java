package ChapterFour;

public class StudentClass {
    private String name;
    private double average;


    public void Student (String name, double average) {
        this.name = name;

        if (average > 0.0) {
            if (average <= 100) {
                this.average = average;
            }
        }
    }
    public void setName(){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAverage(double studentAverage) {
        if(average > 0.0){
            if (average <= 100.0) {
                this.average = average;
            }
        }
    }

    public double getAverage() {
        return average;
    }

    public String getLetterGrade(){
        String letterGrade = " ";
        if (average >= 90){
            letterGrade = "A";
        }
        else {
            if (average >= 80){
                letterGrade = "B";
            }
        }
            if (average >= 70) {
                letterGrade = "C";
            }

        else {
            if (average >= 60) {
                letterGrade = "D";
            }
        }
            letterGrade = "F";
            return letterGrade;
    }
}
