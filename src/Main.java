import taskmanager.TaskManager;

public class Main {


    public static void main(String[] args) {

        new TaskManager("data/tasks.txt").run();
        //new taskmanager.TaskManager("data/task.txt").run();

    }

}
