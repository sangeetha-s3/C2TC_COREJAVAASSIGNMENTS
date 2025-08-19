package com.tnsif.assignmenttwo;



import com.tnsif.assignmenttwo.Student.Student;
import com.tnsif.assignmenttwo.commission.Commission;

public class AssignmentMain {
    public static void main(String[] args) {
        
        // Create Student object (calls default constructor)
        Student s1 = new Student();
        
        // Create Commission object
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}
