import java.util.Scanner;
public class Activity2_BubbleSort{
    static class Student{
        private int idNumber;
        private String lastName;
        private String firstName;
        private String course;
        private double finalGrade;
        
    public Student(int idNumber, String lastName, String firstName, String course, double finalGrade){
        this.idNumber = idNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.course = course;
        this.finalGrade = finalGrade;
    }
    
    public int getIdNumber(){
        return idNumber;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getCourse(){
        return course;
    }
    
    public double getFinalGrade(){
        return finalGrade;
    }
    
    
    }
//
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many students?: ");
        int n = sc.nextInt();
        Student [] student = new Student [n];
        
        for(int i = 0; i < n; i++){      //dili gyud pede n.length
            System.out.println("Student " + (i+1));
            System.out.print(" ID Number: ");
            int id = sc.nextInt();
            
            System.out.print(" Last name: ");
            String last = sc.next();
            
            System.out.print(" First name: ");
                String first = sc.next();
            
            System.out.print(" Course: ");
            String crs = sc.next();;
            
            System.out.print(" Final Grade: ");
            double grade = sc.nextDouble();
            
            student [i] = new Student(id, last, first, crs, grade);
            System.out.println();
        }
        
        for(int i = 0; i<student.length-1; i++){
            for(int j = 0; j<student.length-1; j++){
                if(student[j].getFinalGrade() > student[j + 1].getFinalGrade()){
                    Student temp = student[j];
                    student[j] = student[j+1]; 
                    student[j+1] = temp;
                }
            }
        }
        
        System.out.println();
        System.out.println("Sorted via Final Grade\n");
        for(int i = 0; i < student.length; i++){
            System.out.println("ID: " + student[i].getIdNumber());
            System.out.println("Name: " + student[i].getFirstName() + " " + student[i].getLastName());
            System.out.println("Course: " + student[i].getCourse());
            System.out.println("Final Grade: " + student[i].getFinalGrade());
            System.out.println();
        }
        
    sc.close();
    }
}