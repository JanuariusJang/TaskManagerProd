package taskmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoTest {
    Todo myNewTask=new Todo("Learn German");

    @Test
    void asString() {
        assertEquals("Learn German" + System.lineSeparator()+ "Is done? No", myNewTask.asString());
    }

    @Test
    void asSaveString() {
        assertEquals("T | 0 | Learn German" + System.lineSeparator(), myNewTask.asSaveString());
    }

}