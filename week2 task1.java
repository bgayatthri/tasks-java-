import java.util.*;
import java.util.stream;

class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public String getname(){
        return name;
    }
    public int getmarks(){
        return marks;
    }
}
public class Main(){
    public static void main(String []args){
        Scanner sc=new Sacnner(System.in);
        List<Student>students=new ArrayList<>();

        System.out.print("Enter the number of students:");
        int n=sc.nextInt();
        sc.nextLine();

        for(i=0;i<n;i++){
            System.out.print("Enter the name:");
            String name=sc.nextLine();

            System.out.print("Enter the marks:");
            int marks=sc.nextInt();

            students.add(new Student(name,marks));

        }
        System.out.print("Top students");
        int k=sc.nextInt();

        students.stream()
                .sorted(Comparator(
                .comparingInt(Student::getmarks).reversed()
                .thenComparing(Student::getname)
                .limit(k)
                .forEach(s->
                        System.out.println(s.getname + s.getmarks));
                ))
        sc.close();
    }
}
