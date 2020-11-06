package ru.mirea.ivashchenko.pr10.second;

public class Client {
    public Chair chair;

    public void sit(){
        System.out.println("Sit");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
