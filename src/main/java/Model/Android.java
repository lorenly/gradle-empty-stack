package Model;

public class Android extends Mobile{
    private final int msgLimit = 10;
    @Override
    public void setMessage(String message) {
        if (message.length() > msgLimit)
            super.setMessage("<Android> Message cannot be sent!");
        else
            super.setMessage("<Android>Message : " + message);
    }
}
