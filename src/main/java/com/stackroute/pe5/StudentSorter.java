package main.java.com.stackroute.pe5;
import java.util.Comparator;

public class StudentSorter implements Comparator<Student>{
    /* Create a `StudentSorter` class that implements `Comparator interface` .
    Write a class `Maintest` create Student class object(minimum 5)
     Add these student object into a List of type Student .
    Sort the list based on their age in decreasing order, for student having
    same age, sort based on their name.
     For students having same name and age, sort them according to their ID.*/
    @Override
    public int compare(Student s1,Student s2) {
        int r1,r2,r3;
        r1=s1.studentAge - s2.studentAge;
        r2 = s1.studentName.compareTo(s2.studentName);
        r3=s1.studentID - s2.studentID;
        if(r1!=0)
            return r1;
        else{
            if(r2!=0)
                return r2;
            else
                return r3;
        }
    }

}
