class Student
{
    int id;
    String name;
    String city;

    static int count;

    {
        //executed first
        count++;
    }

    Student()
    {
        System.out.println("Zero param cons");
    }
    Student(int id,String name,String city)
    {
        this.id=id;
        this.name=name;
        this.city=city;
    }
}

public class Launchstatic3
{
    public static void main(String[] args)
    {
        Student st1=new Student(1,"Rohan","Bangaluru");
        System.out.println("obj count"+Student.count);

        Student st2=new Student(2,"Rohit","Mumbai");
        System.out.println("obj count"+Student.count);

        Student st3=new Student(3,"Romesh","Chennai");
        System.out.println("obj count"+Student.count);
    }
}
