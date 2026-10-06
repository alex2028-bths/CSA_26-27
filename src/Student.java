public class Student {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

    Student (String firstName, String lastName, int gradYear ) {
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
}