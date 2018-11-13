package taskmanager;

public abstract class Task {
    protected String taskDescription;
    protected boolean isDone;

    public Task (){
    }

    public Task (String mytask) {
        taskDescription=mytask;
        isDone=false;
    }

    public Task (String mytask, Boolean isDoneOrNot) {
        taskDescription=mytask;
        isDone=isDoneOrNot;
    }

    public boolean isDone(){
        return isDone;
    }

    public void setDone(boolean doneOrNot){
        isDone=doneOrNot;
    }

    /*public void setTaskDescription(String mytask){
        myTaskDescription = mytask;
    }*/

    public String getDescription() {
        return taskDescription;
    }

    public abstract String asString();

    public abstract String asSaveString();

}

