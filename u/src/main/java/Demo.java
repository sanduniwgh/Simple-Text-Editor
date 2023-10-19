public class Demo {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y=0;
            System.out.println(x/y);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Customer{
    private int id;
    private String name;
    private String address;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}