package taskmanager;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class SaveTaskToFile  {
    public static void saveFile(List<Task> myTasks) {
        int currentCount=0;
        String myFile = "data/tasks.txt";
        try {
        File f = new File(myFile);
        Scanner s = new Scanner(f);

            while (s.hasNext()) {
                currentCount++;
                s.nextLine();
            }
            PrintWriter writer = new PrintWriter(myFile);
            writer.print("");
            writer.close();


            //for (int i = currentCount; i < myTasks.size(); i++) {
            for (int i = 0; i < myTasks.size(); i++) {
                //System.out.println(myTasks.get(i).asSaveString());
                writeToFile(myFile, myTasks.get(i).asSaveString());

            }

        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
    private static void writeToFile(String filePath, String textToAdd) throws IOException {
        FileWriter fw = new FileWriter(filePath, true);
        fw.write(textToAdd);
        fw.close();
    }

}
