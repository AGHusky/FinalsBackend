import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        String[] sem = {"First Semester","Second Semester","Short Term"};

        for(int i = 0; i<5; i++) {
            int year = i+1;
            for (int j = 0; j < sem.length; j++) {
                System.out.println("----------------------------------------------------");
                System.out.println("Year = " + year + " Term = " + sem[j]);
                System.out.println("Course No.    Descriptive  Title    Units");
                System.out.println("----------------------------------------------------");
            }//end of j
            if(year == 4){
                i = 0;
            }
            }//end of i
        }
    }


