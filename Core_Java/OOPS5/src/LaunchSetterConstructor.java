class Finishers{
    private int id;
    private String name;
    private String city;

    public Finishers() {
        super(); // can be generated
        System.out.println("Zero param");
    }

    public Finishers(int id, String name, String city) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
        System.out.println("param");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class LaunchSetterConstructor {
    public static void main(String[] args){
        Finishers f1 = new Finishers();
        f1.setId(1);
        f1.setName("kavya");
        f1.setCity("Jalandhar");

        System.out.println(f1.getId());
        System.out.println(f1.getName());
        System.out.println(f1.getCity());

        System.out.println("***********************************");

        Finishers f2 = new Finishers(1,"kavya","Bombay");
        f2.setId(3);
        f2.setName("kavya");
        f2.setCity("Swiss");
        System.out.println(f2.getId());
        System.out.println(f2.getName());
        System.out.println(f2.getCity());
    }
}
