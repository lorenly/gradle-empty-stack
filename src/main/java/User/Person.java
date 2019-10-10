public class Person {
    private String name;
    Person(String name){
       this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void makeCall(Mobile mobile, String message){
            mobile.setName(name);
            mobile.setMessage(message);
            System.out.println(mobile.getPhoneInformation());
            System.out.println(mobile.getMessage());
    }

}
