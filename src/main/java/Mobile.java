public class Mobile extends Person{
    private String phoneName;
    private String color;
    private String brand;

    public void setPhoneName(String name){
        this.phoneName = name;
    }
    public String getPhoneName(){
        return this.phoneName;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void message(String message){
        System.out.println("Message : " + message);
    }

    public String phoneInformation(){
        return "name: " + getPhoneName() + ", color: " + getColor() + ", brand: " + getBrand();
    }
}
