package org.example;

import java.util.ArrayList;
import java.util.List;

public class TestJunitTestCaseExample {
    private List<String> students = new ArrayList<String>();

    public void remove(String name) {
        students.remove(name);
    }

    public void add(String name) {
        students.add(name);
    }

    public void removeAll(){
        students.clear();
    }

    public String sizeOfStudent() {
        return String.valueOf(students.size());
    }
}
