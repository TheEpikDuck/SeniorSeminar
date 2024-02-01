import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tester {
    static String[][] starr = new String[100][20]; 
    static int row = 0;
    static int choice1;
    static int choice2;
    static int choice3;
    static int choice4;
    static int choice5;

    

  public static void main(String[] args) {
    try {
      File myObj = new File("SrSeminar_RawData.csv");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        starr[row] = data.split(",");
        System.out.println(starr[row][0]);
        row++;  

      } //close while
      /*if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }*/
   } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
   }

    choice1 = Integer.parseInt(starr[row][1]);
    choice2 = Integer.parseInt(starr[row][2]);
    choice3 = Integer.parseInt(starr[row][3]);
    choice4 = Integer.parseInt(starr[row][4]);
    choice5 = Integer.parseInt(starr[row][5]);  

    
    public class People{
      static int seminars;
      static int maxPeople;

      for(int i=0; i<18; i++){
        System.out.print("");
        for(int j=0; j<16; j++){
          System.out.print("3");
        }
      }
    }
  

