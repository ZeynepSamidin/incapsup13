package com.company;

public class Fish {
    int length;
    String name;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "length=" + length +
                ", name='" + name + '\'' +
                '}';
    }
}
