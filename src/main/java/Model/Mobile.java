public class Mobile{
    private String name;
    private String color;
    private String brand;
    private String message;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
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

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public String getPhoneInformation(){
        return "name: " + name + ", color: " + color + ", brand: " + brand;
    }
}
