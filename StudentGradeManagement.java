import java.util.Scanner;

class StudentGradeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Java Marks: ");
        int java = sc.nextInt();

        System.out.print("Enter Python Marks: ");
        int python = sc.nextInt();

        System.out.print("Enter SQL Marks: ");
        int sql = sc.nextInt();

        int total = java + python + sql;
        double average = total / 3.0;

        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("\n----- Student Result -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Java Marks : " + java);
        System.out.println("Python Marks: " + python);
        System.out.println("SQL Marks  : " + sql);
        System.out.println("Total      : " + total);
        System.out.println("Average    : " + average);
        System.out.println("Grade      : " + grade);

        sc.close();
    }
}