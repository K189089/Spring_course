class Dog
{
    private int cost;
    private String name;
    private String color;

    // constructor is a type of setter which name is same class 's name to assign values

    // if no constructor is defined java compiler uses default constructor

    Dog(int cost,String name,String color)
    {
        this.cost=cost;
        this.name=name;
        this.color=color;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Constructor
{
    public static void main(String[] args)
    {
        Dog d1=new Dog(4,"Sheru","white");

        System.out.println(d1.getCost());
        System.out.println(d1.getName());
        System.out.println(d1.getColor());
    }
}
