package egg.JUnit.GestorTareas;

import JUnit.GestorTareas.TaskServices;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    TaskServices ts;

    @BeforeEach
    void setUp() {
        ts = new TaskServices();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void validarCreacionTarea(){
        ts.addTask("Tarea 1");
        ts.addTask("Tarea 2");

        List<String> listaEsperada = Arrays.asList("Tarea 1", "Tarea 2");

        assertEquals(2,ts.getTareas().size());

    }
}