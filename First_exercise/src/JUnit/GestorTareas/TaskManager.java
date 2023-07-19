package JUnit.GestorTareas;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private static List<String> tareas = new ArrayList<>();

    public TaskManager(List tareas) {
        this.tareas = tareas;
    }

    public TaskManager() {
    }

    public List getTareas() {
        return tareas;
    }

    public void setTareas(List tareas) {
        this.tareas = tareas;
    }
}
