package User;
import Model.Iphone;
import Model.Mobile;
public class IPhoneRobot {
    private String name;

    public IPhoneRobot(String name){
        this.name = name;
    }

    public void makeCall(Iphone iphone, String message){
        iphone.setMessage(message);
        System.out.println(iphone.getPhoneInformation());
        System.out.println(iphone.getMessage());
    }
}
