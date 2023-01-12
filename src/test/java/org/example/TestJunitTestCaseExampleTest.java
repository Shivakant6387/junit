package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestJunitTestCaseExampleTest {
    TestJunitTestCaseExample obj=new TestJunitTestCaseExample();

    @Test
    void remove() {
        obj.add("Antonio");
        obj.add("Paul");
        obj.remove("Paul");
        assertEquals("Removing 1 student from list", 1, obj.sizeOfStudent());
    }

    @Test
    void add() {
        obj.add("Emma");
        obj.add("Ronan");
        obj.add("Antonio");
        obj.add("Paul");
        assertEquals("Adding 4 student to list", 4, obj.sizeOfStudent());
    }

    @Test
    void removeAll() {
        obj.removeAll();
    }
    @Test
    public void testSize() {
        obj.add("Emma");
        obj.add("Ronan");
        obj.add("Antonio");
        assertEquals("Checking size of List", 3, obj.sizeOfStudent());
    }
    @Test
    void sizeOfStudent() {
    }
}