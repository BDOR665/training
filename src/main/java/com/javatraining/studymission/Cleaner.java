package com.javatraining.studymission;

public class Cleaner {

    private final VacuumCleaner vacuum = new VacuumCleaner();

    public void turnOn() {
        vacuum.turnOn();
    }

    public void clean() {
        vacuum.clean();
    }

    public void turnOff() {
        vacuum.turnOff();
    }

    public void emptyDustbin() {
        vacuum.emptyDustbin();
    }
}
