import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Deadline extends Todo {
    //protected String by;
    protected Date bydate;

    public Deadline(String description, Date mybyDate){
        super(description);
        //by=byDate;
        bydate=mybyDate;
    }

    public Deadline(String description, Date mybyDate, boolean isDone){
        super(description, isDone);
        bydate=mybyDate;
    }

    public String getBy(){

        //return by;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(bydate);
    }
    /*public void setBy(String byDate){
        by=byDate;
    }*/

    @Override
    public String asString() {
        return super.asString() + System.lineSeparator() + "Do by:" + getBy() ;
    }

    public String asSaveString(){
        int isTaskDone = isDone? 1: 0;
        return "D | " + isTaskDone + " | " + myTaskDescription +" | "
                + getBy() + System.lineSeparator();

    }
}
