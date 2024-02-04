import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tester {
  public static void main(String[] args) {
  static String[][] starr = new String[100][20]; 
  ArrayList<Student> students = new ArrayList<>();
  ArrayList<Session> sessions = new ArrayList<Session>();

  int

  String name;
  int id;
  int choice1;
  int choice2;
  int choice3;
  int choice4;
  int choice5;
  //fix this
  

  try {
    File myObj = new File("SrSeminar_RawData.csv");
    Scanner myReader = new Scanner(myObj);
    while (myReader.hasNextLine()) {
      String data = myReader.nextLine().split(",");

        choice1 = Integer.parseInt();
        choice1 = Integer.parseInt()
        choice1 = Integer.parseInt()
        choice1 = Integer.parseInt()
        choice1 = Integer.parseInt()

      row++;  

      } //close while
      /*if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }*/
   }
   
   if(choice1 > 0){
    students.add(new Student(name, choice1, choice2, choice3, choice4, choice5));
   }
   else 
   
   
   catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
   }

     
}
