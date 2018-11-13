package taskmanager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Deadline extends Todo {
<<<<<<< HEAD
    
    protected Date bydate;


    public Deadline(String description, Date mybyDate){
=======

    private Date dateToCompleteTask;

    //used for creation by user when CLI runs.
    public Deadline(String description, Date dateToCompleteTask){
>>>>>>> 7901c9e46c0c76f97b695aa1343cbf86ca38c801
        super(description);
        this.dateToCompleteTask=dateToCompleteTask;
    }

    //used by the file reader.
    public Deadline(String description, Date dateToCompleteTask, boolean isDone){
        super(description, isDone);
        this.dateToCompleteTask=dateToCompleteTask;
    }

    /**
     *returns the deadline in <b>dd/MM/yyyy</b> format
     * @return gets the deadline.
     */
    public String getBy(){

        //return by;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(dateToCompleteTask);
    }

    /**
     *
     * @return everything about the Task.
     */
    @Override
    public String asString() {
        return super.asString() + System.lineSeparator() + "Do by:" + getBy()  ;
    }

    public String asSaveString(){
        int isTaskDone = isDone()? 1: 0;
        return "D | " + isTaskDone + " | " + taskDescription +" | "
                + getBy() + System.lineSeparator();

    }
}
