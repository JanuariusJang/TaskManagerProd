package taskmanager;


import java.util.List;

public class Storage {

    private String filepath;

    public Storage(String filepath) {

        this.filepath=filepath;
    }

    public List<Task> load() throws TaskManagerException{

        return getTasksFromFile.getTasksFromFile(filepath);
    }


    public  Storage (List<Task> mytasks){
        SaveTaskToFile.saveFile(mytasks);
    }
}
