package taskmanager;

import taskmanager.SaveTaskToFile;
import taskmanager.getTasksFromFile;

import java.util.List;

public class Storage {
    private List<Task> tasks; //= new ArrayList<>() not required as object will be created elsewhere.
    //private int currentTaskCount=0;

<<<<<<< HEAD
    public Storage(String filepath) throws TaskManagerException {
        tasks= getTasksFromFile.getTasksFromFile(filepath);
        //System.out.println("taskmanager.Storage ok");
        //currentTaskCount=tasks.size();
    }

    public List<Task> load(){
        return tasks;
=======
    private String filepath;

    public Storage(String filepath) {

        this.filepath=filepath;
    }

    public List<Task> load() throws TaskManagerException{

        return getTasksFromFile.getTasksFromFile(filepath);
>>>>>>> parent of 7901c9e... clean up code
    }



    public  Storage (List<Task> mytasks){
        SaveTaskToFile.saveFile(mytasks);
        //currentTaskCount=0;
    }
}
