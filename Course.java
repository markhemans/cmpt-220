/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (10.9)
 */

public class Course {

    private final String courseName;
    
    public String[] students = new String[10];
    private int numberOfStudents;
    
    public Course(String courseName)
    {
        this.courseName = courseName;
    }

    public void addStudent(String student)
    {
        if (numberOfStudents >= students.length)
        {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }

    public String[] getStudents()
    {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }
   
    public void clear()
    {
        students = new String[2];
        numberOfStudents = 0;
    }
    public void dropStudent(String student)
    {
       for (int i = 0; i < students.length; i++) {
            if (student.equalsIgnoreCase(students[i]))
            {
                numberOfStudents--;
                while (i < numberOfStudents)
                {
                    students[i] = students[i + 1];
                    i++;
                }
                break;
            }
        }
    }
    
    public static void main(String[] args) {
    Course math = new Course("Math");
    System.out.println(math.courseName + "Course");
    System.out.println("Number of students: "+math.getNumberOfStudents());
    System.out.println("Adding students...");
    math.addStudent("James");
    math.addStudent("John");
    math.addStudent("Luke");
    for (int i = 0; i < math.getNumberOfStudents(); i++)
    {
            System.out.println(math.students[i]);
    }
    System.out.println("Number of students: "+math.getNumberOfStudents());
    System.out.println("Dropping James...");
    math.dropStudent("James");
    System.out.println("Number of students: "+math.getNumberOfStudents());
    for (int i = 0; i < math.getNumberOfStudents(); i++)
    {
            System.out.println(math.students[i]);
    }
   System.out.println("Clearing all"); 
   math.clear();
   System.out.println("Number of students: "+math.getNumberOfStudents());
}
}
