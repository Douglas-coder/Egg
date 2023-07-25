package JUnit.GestorTareas;

import java.util.List;

public class TaskServices extends TaskManager {

    public void addTask(String tareas) {
        getTareas().add(tareas);
    }

    public void removeTask(String tareas) {
        getTareas().add(tareas);
    }

    public List<String> getTareas() {
        return getTareas();
    }

}
