package model;

/**
 * Created by Dina_Abdykasheva on 12/12/2016.
 */
public class Bug extends Issue{
    public Bug(int id, String summary, Priority priority, Status status, String description, Employee reporter) {
        super(id, summary, priority, status, description, reporter);
    }

    public Bug() {
    }
}
