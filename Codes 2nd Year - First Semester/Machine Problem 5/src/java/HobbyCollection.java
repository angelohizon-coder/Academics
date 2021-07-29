import java.util.*;

public class HobbyCollection {
    public String getHobby(String hobby)
    {
        /*
            Section that receives the string from the servlet and adds the objects to the arraylist
        */
        List<String> hobbyList = new ArrayList<String>();
        if(hobby.equals("Physical Hobby"))
        {
            hobbyList.add("Basketball");
            hobbyList.add("Volleyball");
            hobbyList.add("Swimming");
        }
        else if (hobby.equals("Creative Hobby"))
        {
            hobbyList.add("Beat Boxing");
            hobbyList.add("Origami");
            hobbyList.add("Web Design");
            hobbyList.add("Photoshop");
        }
        else if (hobby.equals("Random Hobby"))
        {
            hobbyList.add("Watching Anime Series");
            hobbyList.add("Playing Games");
            hobbyList.add("Reading");
        }
        else
        {
            hobbyList.add("Please choose only from the drop-down list");
        }
        
        /*
            Turns the arraylist into a string so that it can be easily displayed in the information.jsp
        */
        
        StringBuffer stringBuffer = new StringBuffer();
      
        for (String string : hobbyList) 
        {
           stringBuffer.append(string);
           stringBuffer.append(" | ");
        }
        String result = " | " + stringBuffer.toString();
        
        return result;
    }

}