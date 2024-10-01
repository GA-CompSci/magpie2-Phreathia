import java.util.Scanner;

public class StringExplorer
{
	public static void main(String[] args)
	{
        // Count down with a "T minus 5"
        for(int i = 5; i > 0; i--) {
            System.out.println("T minus " + i);
        }
      
        // Declare and instantiate a Scanner
        Scanner input = new Scanner(System.in);
    
        // infinite loop 
        while(true) {
            // take an input
            String userSaysWhat = input.nextLine();

            // repeat input + message
            System.out.println(userSaysWhat + " means you need more calcium in your diet");
        
            // implement "equals" to stop with the word "stop"
            if(userSaysWhat.equals("stop")) {
                break;
            }
        }
      
        /*
        ---------------------------
            SAMPLE STUFF
        ---------------------------
        */
  		String sample = "The quick brown fox jumped over the lazy dog.";
  
        // Print the sample and add a blank line after
        System.out.println("OUR SAMPLE:");
  		
        //  Demonstrate the length method.
  		int l = sample.length();
  		System.out.println ("sample.length() = " + l);
  
  		//  Demonstrate the indexOf method.
  		int position = sample.indexOf("quick");
  		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
        //  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
				
		//  toUpperCase
        String upperCase = sample.toUpperCase();
        System.out.println ("sample.toUpperCase() = " + upperCase);
        System.out.println ("After toUpperCase(), sample = " + sample);


        // lastIndexOf
        int lastPosition = sample.lastIndexOf("dog");
        System.out.println ("sample.lastIndexOf(\"dog\") = " + position);

        // substring
        String substring = sample.substring(4, 9);
        System.out.println (substring);
      
        // equals
        System.out.println ("The word \"class\" equals \"class\": ");
        System.out.println ("class".equals("class"));
	}
}