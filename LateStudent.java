import java.util.ArrayList;
import java.util.Random;

public class LateStudent {

    public static String randomize(String[] arrayList){
    
        int [] seminarID = {1,2,3,4,5}
        
        ArrayList<String> students = new ArrayList<String>(); 
        students = {"Haotong Lu" , "Mia Masterson" , "Olivia Scheper" , "Colin Sam" , "Kylan Young"};
    //Random() the people who didn't fill out the form and put them into 5 random sessions

//i think i need to add in a loop here a while loop maybe so it repeats 5 times?

    int randomIndex()= (int)(Math.random())
    int studentOne = seminarID[randomIndex];
    int studentTwo = seminarID[randomIndex + 1];
    int studentThree = seminarID[randomIndex + 2];
    int studentFour = seminarID[randomIndex + 3];
    int studentFive = seminarID[randomIndex + 4];

    System.out.print(studentOne, studentTwo, studentThree, studentFour, studentFive);

    
    
        
    }
}
