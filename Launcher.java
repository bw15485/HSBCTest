import java.util.ArrayList;

public class Launcher 
{
    public static void main(String[] args) 
    {
        NoteStore ref = new NoteStore();
        ref.storeNote("Java is a set of computer software and specifications developed by James Gosling at sun Microsystems");
        ref.storeNote("Few books to read - Ikigai, How to win friends and influence people");

        ref.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
        ref.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");

        System.out.println("");
        System.out.println("");
        
        displayTextNotes(ref.getAllTextNotes());

        System.out.println("");
        System.out.println("");

        printTextAndImageNotes(ref.getAllTestAndImageNotes());

        System.out.println("");
        System.out.println("");

    }


    public static void displayTextNotes(ArrayList<TextNote> list)
    {
        int counter = 1;
        for(TextNote entry : list)
        {        
            System.out.println("Text Note " + counter +": " + entry.getMessage());
            counter++;
        }

    }

    public static void printTextAndImageNotes(ArrayList<TextAndImageNote> list)
    {
        int counter = 1;
        for(TextAndImageNote entry : list)
        {                       
            System.out.println("Text and Image Note " + counter + ": " + entry.getMessage() + " , " + entry.getUrl());
            counter++;
        }

    }
 
}
