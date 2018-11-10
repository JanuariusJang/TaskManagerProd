import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Parser {

    public static String getCommandWord (String fullCommand){
        return fullCommand.split(" ")[0];
    }

    public static Todo createTodo (String fullCommand) throws TaskManagerException{
        if(fullCommand.length()<6)
            throw new TaskManagerException("Task description not available");
        String todoDescription=(fullCommand.substring("todo".length())).trim();
        return new Todo (todoDescription);
    }

    public static Deadline createDeadline (String fullCommand) throws TaskManagerException{
        Date mydeadline;
        String deadlineDescription=fullCommand.split("/by")[0];
        String deadline=fullCommand.split("/by")[1];
        try {
            mydeadline = new SimpleDateFormat("dd/MM/yyyy").parse(deadline.trim());
        }
        catch (ParseException e){
            throw new TaskManagerException("Date field is wrong");
        }
        //return new Deadline(deadlineDescription.substring("deadline".length()).trim(),deadline.trim());
        return new Deadline(deadlineDescription.substring("deadline".length()).trim(),mydeadline,false);



    }

    public static int getLineNumber(String fullCommand){
        return Integer.parseInt(fullCommand.split(" ")[1]);
    }
}
