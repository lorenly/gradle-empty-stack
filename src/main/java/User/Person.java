package User;

import Model.Mobile;

public class Person {
    private String name;
    public Person(String name){
       this.name = name;
    }

    public void makeCall(Mobile mobile, String message){
            mobile.setName(name);
            mobile.setMessage(message);
            System.out.println(mobile.getPhoneInformation());
            System.out.println(mobile.getMessage());
    }

}
