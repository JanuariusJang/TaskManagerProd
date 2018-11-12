package taskmanager;


import java.util.List;

public class Storage {

    private String filePath;

    public Storage(String filePath) {

        this.filePath=filePath;
    }

    public List<Task> load() throws TaskManagerException{

        return getTasksFromFile.getTasksFromFile(filePath);
    }


    public  Storage (List<Task> mytasks){
        SaveTaskToFile.saveFile(mytasks);
    }
}
