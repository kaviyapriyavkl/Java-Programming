import java.util.*;

class Student
{// variable declaration
int id;
String firstname;
String lastname;
int age;
float cgpa;

//Setter method
void setid(int id){ this.id=id;}
void setfirstname(String firstname){this.firstname=firstname;}
void setlastname(String lastname){this.lastname=lastname;}
void setage(int age){this.age=age;}
void setcgpa(float cgpa){this.cgpa=cgpa;}


//gEtter method
int getid(){return id;}
String getfirstname(){return firstname;}
String getlastname(){return lastname;}
int getage(){return age;}
float getcgpa(){return cgpa;}


}


public class oops {

    //display method
    static void display(Student S1)
    {
        System.out.println(S1.getid());
        System.out.println(S1.getfirstname());
        System.out.println(S1.getlastname());
        System.out.println(S1.getage());
        System.out.println(S1.getcgpa());

    }
    public static void main(String [] args)

    {
        Scanner sc=new Scanner(System.in);

        //geting user value
        System.out.println("Input--------------------");
        int id=sc.nextInt();
        String firstname=sc.next();
        String lastname=sc.next();
        int age=sc.nextInt();
        float cgpa=sc.nextFloat();

        //creating object
        Student s1=new Student();

        //setting value
        s1.setid(id);
        s1.setfirstname(firstname);
        s1.setlastname(lastname);
        s1.setage(age);
        s1.setcgpa(cgpa);

        //sending values to diaplay
        System.out.println("\nOutput-------------------");
        display(s1);



    }
 
}
