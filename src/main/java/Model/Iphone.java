public class Iphone extends Mobile{
    private final int msgLimit = 15;
    @Override
    public void setMessage(String message) {
        if (message.length() > msgLimit)
            super.setMessage("<Iphone> Message cannot be sent!");
        else
            super.setMessage("<Iphone>Message : " + message);
    }
}
