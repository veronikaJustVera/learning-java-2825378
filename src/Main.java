package src;

public class Main {
    public static void main(String[] args) {
        int studentAge = 20;
        double studentGPA = 85.5;
        boolean hasPerfectAttendance = true;
        String studentFirstName = "Veronika";
        String studentLastName = "Demianenko";
        String studentName = studentFirstName + " " + studentLastName;
        char studentFirtInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        
        String outputText = 
            "Student " + studentFirtInitial + ". " + studentLastInitial + ". - "  + 
            studentName + " (" + studentAge + " y.o.) has GPA - " +  studentGPA;

        outputText += hasPerfectAttendance ? " and perfect attendance" : " but not perfect attendance";
        System.out.println(outputText);
    }
}
