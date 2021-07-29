import java.util.Scanner;

public class RecordingSort3
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		Recording[] record = new Recording[5];
		String artist, song;
		int time = 0;
		
		for(int i = 0; i < record.length; i++)
		{
			System.out.print("Artist: ");
			artist = scan.next();
			
			System.out.print("Song: ");
			song = scan.next();
			
			System.out.print("Time: ");
			time = scan.nextInt();
			
			Recording temp = new Recording();	
			
			temp.setArtist(artist);
			temp.setSong(song);
			temp.setPlayTime(time);
			
			record[i] = temp;
			
			System.out.println(record[i].getArtist() + " " + record[i].getSong() + " " + record[i].getPlayTime() + "\n");
		}
		
		sortArtist(record);
		sortSong(record);
		sortTime(record);
	
		for(int i = 0; i < record.length; ++i)
			System.out.println(record[i].getArtist() + " " + record[i].getSong() + " " + record[i].getPlayTime());
	
		System.out.println("Maximum number: " + sortMax(record));
		System.out.println("Minimum number: " + sortMin(record));
		
		sort(record);
		
		System.out.print("Insertion Sort: ");
		for(int i = record.length-1; i != -1; i--)
			System.out.print(record[i].getPlayTime() + " ");

		scan.close();
	}
	
	public static void sortArtist(Recording[] array)
	{
      int a,b;
      Recording temp;
      String stringB, stringBPlus;
      int highSubscript = array.length - 1;
      for(a = 0; a < highSubscript; ++a)
         for(b = 0; b < highSubscript; ++b)
         {
            stringB = array[b].getArtist();
            stringBPlus = array[b + 1].getArtist();

            if(stringB.compareTo(stringBPlus) > 0)
            {
               temp = array[b];
               array[b] = array[b + 1];
               array[b + 1] = temp;
            }
         }	
    }
	
	public static void sortSong(Recording[] array)
	{
       int a,b;
       Recording temp;
       String stringB, stringBPlus;
       int highSubscript = array.length - 1;

       for(a = 0; a < highSubscript; ++a)

          for(b = 0; b < highSubscript; ++b)
          {
             stringB = array[b].getSong();
             stringBPlus = array[b + 1].getSong();

             if(stringB.compareTo(stringBPlus) > 0)
               {
                  temp = array[b];
                  array[b] = array[b + 1];
                  array[b + 1] = temp;
               }
          }
    }
	
	public static void sortTime(Recording[] array)
	{
       int a,b;
       Recording temp;
      
       int highSubscript = array.length - 1;

       for(a = 0; a < highSubscript; ++a)

          for(b = 0; b < highSubscript; ++b)
          {
             if(array[b].getPlayTime() > array[b + 1].getPlayTime())
               {
                  temp = array[b];
                  array[b] = array[b + 1];
                  array[b + 1] = temp;
               }
          }
    }
	
	public static int sortMax(Recording[] record)
	{	
		int max = record[0].getPlayTime();
		
		for(int i = 0; i < record.length; i++)
		{
			if(record[i].getPlayTime() >= max)
			{
				max = record[i].getPlayTime();
			}
		}
		
		return max;
	}
	
	public static int sortMin(Recording[] record)
	{
		int min = record[0].getPlayTime();
		
		for(int i = 0; i < record.length; i++)
		{
			if(record[i].getPlayTime() < min)
			{
				min = record[i].getPlayTime();
			}
		}
		
		return min;
	}	
	
	public static void sort(Recording[] record) 
    { 		
		for (int i = 1; i < record.length; ++i) { 
            Recording temp = record[i]; 
            int j = i - 1; 
  
            while (j >= 0 && record[j].getPlayTime() > temp.getPlayTime()) 
			{ 
                record[j + 1] = record[j]; 
                j = j - 1; 
            } 
            record[j + 1] = temp; 
        } 
    }
}