package com.tnsif.assignmentthree;


public class Item {
	protected int id;
    protected String title;

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Title: " + title);
    }
}
