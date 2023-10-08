
public class Main {
    private String task;
    public String getTask(){
        return this.task;
    }
    public void setTask(String task){
        this.task=task;
    }
    public static void main(String args[]){
        Main task= new Main();
        task.setTask("Do Homework");
        System.out.println(task.getTask());
    }
}
