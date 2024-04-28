/*
enter num 1-9
x is not an integer
x should be between 1-9
 */
import java.io.*;
import java.util.*;
public class MyChecklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("""
                ----------------------------------------------------------------------------------------------------------------
                My Checklist Management
                <1> Show subjects for each school term
                <2> Show subjects with grades for each term
                <3> Enter grades for subjects recently finished
                <4> Edit a course
                <5> Add other courses taken
                <6> Display courses with Grade point Average
                <7> Display courses in alphabetical order
                <8> Display courses with grades in Highest to Lowest
                <9> Quit
                """);

        while(true) {
            try {
                do{
                    System.out.print("Enter a Number from 1-9: ");
                    n = Integer.parseInt(sc.next());
                    if (n < 1 || n >= 10) {
                        System.out.println("Please Enter a Number between 1 and 9.");
                    }
                }while(n < 1 || n >= 10);
                break;
            }
            catch(NumberFormatException e){
                System.out.println("It's Not A Number!");
            }
        }

        switch(n) {
            case 1:
                try {
                    Scanner scanner = new Scanner(new FileReader("C:\\Users\\doria\\IdeaProjects\\FinalsProject\\src\\curriculum"));
                    newPeriod();
                        while (scanner.hasNextLine()) {

                            ArrayList<Curriculum> courseArray = new ArrayList<>();
                            Curriculum curriculum = new Curriculum();//MIND LATER
                            String lineOfText = scanner.nextLine();
                            String[] data = lineOfText.split("`");
                            if(data[0] == "") {
                                int index = 0;
                                int year = index+1;
                                String[] sem = {"First Semester","Second Semester","Short Term"};
                                newPeriod(index, sem);
                                System.out.println("----------------------------------------------------");
                                System.out.println("Year = " + year + " Term = " + sem[index]);
                                System.out.println("Course No.  Descriptive Title  Units");
                                System.out.println("----------------------------------------------------");
                            }
                            if (!data[0].isBlank()) {
                                curriculum.setCode(data[0]);
                                curriculum.setSubject(data[1]);
                                curriculum.setUnit(data[2]);
                                courseArray.add(curriculum);
                                System.out.println(courseArray);
                            } else if (data[0].isEmpty()) {
                                promptEnter();
                            }
                        }
                        scanner.close();
                        break;

                    } catch(FileNotFoundException e){
                        System.out.println("File Unavailable.");
                    }
                catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("Array out of bounds");
                    }
                catch(IllegalStateException e){
                        System.out.println("""
                                                            
                                End of Curriculum
                                ----------------------------------------------------
                                """);
                    }
                    break;
        }//end of case 1

    }//end of main
    public static void promptEnter(){
        System.out.println("""
                
                Press [Enter] to Continue...
                """);
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }
    public static int newPeriod(){
        int index = 0;
        int year = index+1;
        String[] sem = {"First Semester","Second Semester","Short Term"};
        newPeriod(index, sem);
        System.out.println("----------------------------------------------------");
        System.out.println("Year = " + year + " Term = " + sem[index]);
        System.out.println("Course No.  Descriptive Title  Units");
        System.out.println("----------------------------------------------------");
        return index;
    }
    public static int newPeriod(int index, String[] sem){
        index = index + 1;
        if(sem[index].equals("Short Term")) {
            index = 0;
        }
        return index;
    }
}
