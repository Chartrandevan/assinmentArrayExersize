package arrayexersize;

/********************************************************************
 * Programmer:	sveinson
 * Class:       CS30S
 *
 * Assignment:      simple static method example
 * Program Name:    simpleStaticMethodExample
 *
 * Description: use static methods to perform some simple
 *              operations.
 *
 * Input: some integers from the keyboard
 *
 * Output: banners and closing messages
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
import java.util.Random;
 

public class ArrayExersize{  // begin class

    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    final int max = 5;			// maximum number of randoms allowed
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	
        String banner;                          //string for printing banners
    	String prompt;				// prompt for use in input dialogs
    	
        String tokens[];
    	String delim = " ";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
           Random r = new Random();		// create new random object
        int rand = r.nextInt(128);				// generate a random number between 0 and 127
          
        int arreh[] = new int[max];
        int count = 0 ;
    // create instances of objects for i/o and formatting
    
    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("$##.00");
    	
    	//BufferedReader fin = new BufferedReader(new FileReader("name of file"));
    	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
    // below are the mathod calls that tell the program to run the sub-program.
        
        printBanner();                      // print a banner to the output windowl
        fileBanner(fout);
        banner = windowBanner();         // make a string to print in joption pane

JOptionPane.showMessageDialog(null, banner);    	
    
 	   	
    // ************************ get input **********************

    	prompt = "Enter five numbers";	
     strin = (JOptionPane.showInputDialog(banner + "\n" + prompt));
     tokens = strin.split(delim);
     int incount=0;
     
     while(incount < max){
     arreh[incount]= Integer.parseInt(tokens[incount]);
     incount++;
     }//end while
    
    // get input from the keyboard by calling the getNumber method
    // note the argument that is passed into the method
    // also note that since getNumber has a return type (int) you must use it
    // in a context where the returning value has someplace to go
       
    
    // ************************ processing ***************************
                   
      //  sum = add(op1, op2);            // add operands 1 and 2
                    
    // ************************ print output ****************************
    System.out.println("original order = "); 
    for(count = 0; count < max; count++){     
     System.out.print(tokens[count] + " ");
    }//end while
      System.out.println("\nreverse order = "); 
    for(count = 4; count > -1; count--){     
     System.out.print(tokens[count] + " ");
    }//end while
        // ******** closing message *********
        
        System.out.println("\nend of processing.");
        fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main

// ******************** static methods *****************************

    //************************************************
    // Purpose: get one int value from the keyboad
    // Interface: IN: string prompt
    // Returns: int read from keyboard buffer
    // *****************************************************
    public static int getNumber(String p, String banner, String promt){
        int n = 0;          // local varible to hold integer from keyboard buffer
        n = Integer.parseInt(JOptionPane.showInputDialog(banner, promt));
        return(n);
    } // end getNumber
    
    //************************************************
    // Purpose: print an output banner to the output window
    // Interface: IN: none
    // Returns: none
    // *****************************************************
    public static void printBanner(){
        System.out.println("*******************************************\\n");
        System.out.println("Name:		Evan Chartrand");
        System.out.println("Class:		CS30S");
        System.out.println("Assignment:	Ax Qy");
        System.out.println("*******************************************");
    }  // end print banner
    
    //************************************************
    // Purpose: print an output banner to the output file
    // Interface: IN: PrintWriter
    // Returns: none
    // *****************************************************
    public static void fileBanner(PrintWriter fo){
        fo.println("*******************************************");
        fo.println("Name:		Evan Chartrand");
        fo.println("Class:		CS30S");
        fo.println("Assignment:	Ax Qy");
        fo.println("*******************************************");    
    } // end fileBanner
    
    //************************************************
    // Purpose: Make an output banner string to use with message
    //          dialogs
    // Interface: IN: none
    // Returns: output banner string
    // *****************************************************
    public static String windowBanner(){
        // *** local variabls ***
        
        String banner;               // output banner for windows
        
        // **** create banner ****
        
        banner = "*******************************************\n";
        banner += "Name:		Evan Chartrand\n";
        banner += "Class:		CS30S\n";
        banner += "Assignment:	Ax Qy\n";
        banner += "*******************************************\n\n";  
        
        // *** return the banner ***
        
        return banner;           
    } // end windowBanner
}  // end clas