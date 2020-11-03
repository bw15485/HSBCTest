
import java.util.ArrayList;

public class NoteStore 
{
    ArrayList<TextNote> textNoteList = new ArrayList<TextNote>();
    ArrayList<TextAndImageNote> textAndImageNoteList = new ArrayList<TextAndImageNote>();
    
    public void storeNote(String message)
    {
        TextNote note =new TextNote(message);
        textNoteList.add(note);
    }
    
    public void storeNote(String message, String imageUrl)
    {
        TextAndImageNote tnote = new TextAndImageNote(message, imageUrl);
        textAndImageNoteList.add(tnote);
    }


    public ArrayList<TextNote> getAllTextNotes()
    {
        return textNoteList;
    }

    public ArrayList<TextAndImageNote> getAllTestAndImageNotes()
    {
        return textAndImageNoteList;
    }
}
