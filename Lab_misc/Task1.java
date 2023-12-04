import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        Todo list = new Todo(5);
        Todo.Task task1 = new Todo().new Task("Task1","no","In Progesss");        
        
        Todo.Task task2 = new Todo().new Task("Task2","no","todo");        
        Todo.Task task3 = new Todo().new Task("Task3","yes","Done");        
        Todo.Task task4 = new Todo().new Task("Task4","Ok","Progesss");        
        
        
        list.add(task1);
list.add(task2);
list.add(task3);
list.add(task4);
list.updateStatus("Task1");
list.display();
System.out.println("Deletion Method Called");
list.delete("Task3");
System.out.println("\n Deletation Method Ended");
list.display();

    }
}

class Todo {

    class Task {
        public String title;
        public String discription;
        public String status;

        public Task() {
            this.title = "";
            this.discription = "";
            this.status = "";
        }

        public Task(String title, String discription, String status) {
            this.title = title;
            this.discription = discription;
            this.status = status;
        }

    }
        //instances of Todo Class
    public Todo.Task[] list;
    int size = 0;

    public Todo(int listSize) {
        list = new Todo.Task[listSize];
    }
    public Todo()
    {

    }

    public void add(Task task) {

        if (size == list.length) {
            System.out.println("List is full");
            return;
        }
        list[size++] = task;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println("Title : " + list[i].title);
            System.out.println("Discription : " + list[i].discription);
            System.out.println("Status : " + list[i].status);

        }
        System.out.println();
    }

    public void updateStatus(String title) {
        for (int i = 0; i < size; i++) {

            if (title.equals(list[i].title)) {

                list[i].status = "Done";
            }
        }

    }

    public void delete(String title) {

        Task[] tempList = new Todo.Task[size];
        // temparory save list in templist.
        for (int i = 0; i < tempList.length; i++) {
            tempList[i] = list[i];
        }
        System.out.println(Arrays.toString(tempList));

        int count = -1;
        // perform deletion
        for (int i = 0; i < size; i++) {
 
            if (!(title.equals(tempList[i].title))) {
                list[++count] = tempList[i];
            } else {
                tempList[i] = null;
            }
        }
        for (int i = 0; i <=count; i++) {
            System.out.print("Titles : "+list[i].title+" ");
        }
        size--;
    }

}
