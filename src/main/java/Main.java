public class Main {
    public static void main(String[] args) {
        String example = "Hello World!";
        System.out.println(example);

        MobilePhone phone = new MobilePhone("phone","500g",100);
        MobilePhone oldPhone = new MobilePhone("old phone","400g",200);
        MobilePhone newPhone = new MobilePhone("new phone");
        phone.viewWalues();
        System.out.println(phone.getValue());
    }
}

class MobilePhone{
    String weight = "100g";
    String name;
    int price;

    public MobilePhone(String name, String weight, int price) {
        this.weight = weight;
        this.name = name;
        this.price = price;
    }

    public MobilePhone(String name) {
        this.name = name;
    }

    public void viewWalues(){
        System.out.println("The weight of " + name + " is " +weight + ". The price is "+ price);
    }

    public String getValue(){
        String all = "name " + name + " wegiht " + weight + " price "+ price;
        return all;
    }

}