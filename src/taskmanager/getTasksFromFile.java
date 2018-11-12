package taskmanager;

import taskmanager.Deadline;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class getTasksFromFile {

    public static List<Task> getTasksFromFile(String filepath)throws TaskManagerException {
        List<Task> loadedTasks = new ArrayList<>();
        try {
            List<String> lines = getLines(filepath);
            for (String line : lines) {
                if (line.trim().isEmpty()) { //ignore empty lines
                    continue;
                }
                loadedTasks.add(createTask(line)); //convert the line to a task and add to the list
            }
        } catch (FileNotFoundException e) {
            //printError("problem encountered while loading data: " + e.getMessage());
            throw new TaskManagerException("");


        }
        return loadedTasks;
    }

    private static List<String> getLines(String data) throws FileNotFoundException{
        File f = new File(data);
        Scanner s = new Scanner(f); // create a Scanner using the File as the source
        List <String> myStrings=new ArrayList<>();
        while (s.hasNext()) {
            myStrings.add(s.nextLine());
        }
        return myStrings;
    }

    private static Task createTask(String myTask) throws TaskManagerException {
        String TaskType=myTask.split("\\|")[0].trim();
        String DoneOrNot=myTask.split("\\|")[1].trim();
        String TaskDescription=myTask.split("\\|")[2].trim();


        //System.out.println(TaskType);
        if (TaskType.contains("T")){
            boolean done=false;
            if (Integer.parseInt(DoneOrNot)==1)
                done=true;

           // System.out.println(DoneOrNot);
            return new Todo(TaskDescription, done);

        }
        else if (TaskType.contains("D")){
            String Deadline=myTask.split("\\|")[3].trim();
            Date mydeadline;

            try {
                mydeadline = new SimpleDateFormat("dd/MM/yyyy").parse(Deadline.trim());
            }
            catch (ParseException e){
                throw new TaskManagerException("Date field is wrong");
            }


            boolean done=false;
            if (DoneOrNot=="1")
                done=true;
            //System.out.println("deadline added");
            return new Deadline(TaskDescription, mydeadline, done);
            //return new taskmanager.Todo(TaskDescription, done);

        }
        else {
            return null;
        }
    }

    private static void printError(String errorMsg) {
        System.out.println(errorMsg+ " error! please try again");
    }


}
