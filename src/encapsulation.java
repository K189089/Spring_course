class Learner{

    private int id;
    private String name;
    private String city;

    void setId(int id){
        this.id=id;
    }
    void setName(String name){
        this.name = name;
    }
    void setCity(String city){
        this.city=city;
    }

    int getId()
    {
        return id;
    }
    String getCity(){
        return city;
    }
    String getName(){
        return name;
    }

}

public class encapsulation {
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