class Mobile{
    String name;
    int price;
    String model;
    static String madein;
    
    public void show(){
        System.out.println("Name:" + name + " Price:" + price + " Model:" + model + " MadeIn:" + madein);
    }
    
    public static void showdet(Mobile obj) {
        System.out.println("Name:" + obj.name + " Price:" + obj.price + " Model:" + obj.model + " MadeIn:" + madein);
        
    }
}
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Mobile obj = new Mobile();
        obj.name = "Apple";
        obj.price = 1700;
        obj.model = "iphone15";
        Mobile.madein = "California";
        obj.show();
        
        Mobile.showdet(obj);
    }
}
