class Student
{
    int id;
    String name;
    String city;
    static int count;

    Student()
    {
        System.out.println("Zero param const");
        count++;
    }
    Student(int id,String name,String city)
    {
        this.id=id;
        this.name=name;
        this.city=city;
        count++;
    }
}


public class launchstatic3
{
    public static void main(String[] args){
        Student st1=new Student(1,"rohan","bengaluru");
        System.out.println(st1.count);

        Student st2=new Student(2,"rohit","mumbai");
        System.out.println(st2.count);
    }
}
