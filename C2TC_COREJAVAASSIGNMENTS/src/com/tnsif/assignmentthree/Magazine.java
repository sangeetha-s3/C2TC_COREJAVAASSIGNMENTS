package com.tnsif.assignmentthree;


public class Magazine extends Item {
    private int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: [ID: " + id + ", Title: " + title + ", Issue: " + issueNumber + "]");
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}