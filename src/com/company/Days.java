package com.company;

public enum Days {
    MONDAY("Duishombu"),
    TUESDAY("Sheishembi"),
    WEDNESDAY("Sharshenbi"),
    THURSDAY("Beishenbi"),
    FRIDAY("Juma"),
    SATURDAY("Ishembi"),
    SUNDAY("Jekshembi");
    private String name;

    Days(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Days=  "  + name;
    }
}
