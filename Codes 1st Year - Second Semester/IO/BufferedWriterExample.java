import java.io.*;  
public class BufferedWriterExample 
{  
    public static void main(String[] args) throws Exception 
    {     
        FileWriter writer = new FileWriter("testout.txt");  
        BufferedWriter buffer = new BufferedWriter(writer);  
        buffer.write(br());  
        buffer.close();  
        System.out.println("Success");  
        System.out.println("\n----------\n");  
        System.out.println(fr());
    }  

    public static String br()
    {
        String word = "";

        System.out.print("Enter some text and press Enter: ");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            word = br.readLine();
        }

        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

        return word;
    }

    public static String fr()
    {
        String word = "";
        try(BufferedReader br = new BufferedReader(new FileReader("testout.txt")))
        {
            System.out.println("The contents of testout.txt ...");
            while(br.ready())
            {
                word = br.readLine();
            }
        }

        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

        return word;
    }
}  