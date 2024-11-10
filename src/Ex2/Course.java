package Ex2;

import java.util.Arrays;

public class Course {
    private String name;
    private int numberOfStudents;
    private Student [] students;
    private final int DEFAULT_CAPACITY=2;

    public Course(String name) {
        {this(name, DEFAULT_CAPACITY);}

        public Course(String name, int capacity){

            this.name = name;
            this.students = new Student[capacity];
            this.numberOfStudents = 0; //initialize variables

        }

    }
    public String getCourseName{return this.name;}
    public int getNumberOfStudents(){return this.numberOfStudents;}

    public Student [] getStudents()
    {
        return Arrays.copyOfRange(this.students,0,numberOfStudents);
}

public void addStudent(Student student){
        if (numberOfStudents==students.length){
            //create a new array to store more students than the capacity
            Student [] temp = new Student[students.length*2];
            System.arraycopy(students,0,temp,0,students.length);
            students = temp;
        }
        students[++numberOfStudents] = student;
    }
}