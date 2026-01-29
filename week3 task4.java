import java.util;
class Student{
    private String name;
    private id int;
    private CGPA double;

    Student (String name ,id int,CGPA double){
        this.name=name;
        this.id=id;
        this.CGPA=CGPA;
    }
    public String getName{
        return name;
    }
    public int getId{
        return id;
    }
    public String getCGPA{
        return CGPA;
    }
    public class Main(){
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        List<Student>students=new ArrayList<>();

        System.out.print("Enter the number of students:");
        int n=sc.nextInt();
        sc.nextLine();

        for(i=0;i<n;i++){
            System.out.print("Enter the name:");
            String name=sc.nextLine();
            System.out.print("Enter the id:");
            int id=sc.nextInt();
            System.out.print("Enter the CGPA:");
            int CGPA=sc.nextInt();

            students.add(new Student(name,CGPA));

        }
        System.out.print("Top students");
        int k=sc.nextInt();

        students.stream()
                .sorted(Comparator(
                .comparingInt(Student::getCGPA).reversed()
                .thenComparing(Student::getname)
                .limit(k)
                .forEach(s->
                        System.out.println(s.getname + s.getCGPA));
                ))
        sc.close();
}