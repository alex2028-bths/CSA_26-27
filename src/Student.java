public class Student {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

    public Student (String firstName, String lastName, int gradYear ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        testScoreCount = 0;
        accumulatedTestScores = 0.0;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getGradYear() {
        return gradYear;
    }

    String setFirstName (String newFirstName) {
        firstName = newFirstName;
        return firstName;
    }

    String setLastName (String newLastName) {
        lastName = newLastName;
        return lastName;
    }

   int setGradYear (int newGradYear) {
        gradYear = newGradYear;
        return gradYear;
    }

    double addTestScore (double testScore) {
        accumulatedTestScores += testScore;
        testScoreCount++;
        return accumulatedTestScores;
    }

    boolean isPassing() {
        if ((accumulatedTestScores/testScoreCount) > 65) {
            return true;
        }
        return false;
    }

    double averageTestScore() {
        return (accumulatedTestScores/testScoreCount);
    }

     public void printStudentInfo() {
        System.out.println("Student Full Name: " + getFirstName() + " " + getLastName());
        System.out.println("Graduation Year: " + getGradYear());
        System.out.println("Number of Test Scores: " + testScoreCount);
        System.out.println("Average Test Scores: " + averageTestScore());
        System.out.println("Is passing: " + isPassing());
    }
}