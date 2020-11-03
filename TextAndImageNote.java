public class TextAndImageNote 
{
    private String message;
    private String url;


    public TextAndImageNote(String m, String u)
    {
        message = m;
        url = u;
    }

    public String getMessage()
    {
        return message;
    }

    public String getUrl()
    {
        return url;
    }
}
