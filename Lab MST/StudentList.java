import java.util.ArrayList;

class EmptyListException extends Exception {
    public EmptyListException(String msg) {
        super(msg);
    }
}

public class StudentList {
    private ArrayList<String> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
    }

    public void removeStudent(String name) throws EmptyListException {
        if (students.isEmpty())
            throw new EmptyListException("List is empty!");
        students.remove(name);
    }

    public void display() {
        System.out.println(students);
    }

    public static void main(String[] args) {
        StudentList sl = new StudentList();
        try {
            sl.addStudent("Harsh");
            sl.addStudent("Raghav");
            sl.display();               
            sl.removeStudent("Alice");
            sl.display();               
            sl.removeStudent("Harsh");
            sl.removeStudent("Raghav");   
        } catch (EmptyListException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
