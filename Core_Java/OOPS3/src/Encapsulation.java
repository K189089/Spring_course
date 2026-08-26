class Learner{

    //Encapsulation is process of giving controlled access of data by using private and setter and getter

    private int id;
    private String name;
    private String city;
    // Can generate getter and setter
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Learner ln = new Learner();
        ln.setId(1);
        ln.setCity("jalandhar");
        ln.setName("kavya");

        System.out.println(ln.getId());
        System.out.println(ln.getName());
        System.out.println(ln.getCity());
    }
}