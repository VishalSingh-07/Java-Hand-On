package Simple_Java_SBQ_Question_1;

import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();scan.nextLine();
        Student[] students=new Student[n];
        for(int i=0;i<n;i++){
            int id=scan.nextInt();scan.nextLine();
            String name=scan.nextLine();
            int total_marks=scan.nextInt();
            students[i]=new Student(id,name,total_marks);
        }
        String studentNameWithHighestTotal=findStudentWithHighestTotal(students);
        System.out.println(studentNameWithHighestTotal);
        ArrayList<Integer> sorStudent=searchStudentsByPercentage(students);
        if(sorStudent.isEmpty()){
            System.out.println("No Student found with mentioned attribute.");
        }
        else{
            for(int i=0;i<sorStudent.size();i++){
                System.out.println(sorStudent.get(i));
            }
        }


    }
    public static String findStudentWithHighestTotal(Student[] students){
        int maxScore=Integer.MIN_VALUE;
        String studentName="";
        for(Student st: students){
            int marks=st.getTotmarksobt();
            if(marks>maxScore){
                maxScore=marks;
                studentName=st.getName();
            }
        }
        return studentName.toUpperCase();
    }
    public static ArrayList<Integer> searchStudentsByPercentage(Student[] students){
        ArrayList<Integer> sortStudents=new ArrayList<>();
        for(Student st: students){
            int percentage=(st.getTotmarksobt()*100)/400;
            if(percentage>=70){
                sortStudents.add(st.getId());
            }
        }
        if(sortStudents.isEmpty()){
            return new ArrayList<>();
        }
        Collections.sort(sortStudents);
        return sortStudents;
    }


}
class Student{
    private int id;
    private String name;
    private int totmarksobt;

    Student(int id, String name, int total_marks){
        this.id=id;
        this.name=name;
        this.totmarksobt=total_marks;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getTotmarksobt(){
        return this.totmarksobt;
    }
    public void setTotmarksobt(int totmarksobt){
        this.totmarksobt=totmarksobt;
    }
}
