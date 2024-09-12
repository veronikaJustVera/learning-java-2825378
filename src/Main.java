package src;

public class Main {
    public static void main(String[] args) {
        int studentAge = 20;
        double studentGPA = 85.5;
        // char studentFirtInitial = 'V';
        // char studentLastInitial = 'D';
        boolean hasPerfectAttendance = false;
        String studentFirstName = "Veronika";
        String studentLastName = "Demianenko";
        String studentName = studentFirstName + " " + studentLastName;
        
        String outputText = "Student " + studentName + " (" + studentAge + " y.o.) has GPA - " +  studentGPA;
        if (hasPerfectAttendance) {
            outputText += " and perfect attendance";
        } else {
            outputText += " but not perfect attendance";
        }
        System.out.println(outputText);
    }
}
