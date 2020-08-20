package com.makkkkkkkks.model;

public class Car {
    private User user;
    private String model;

    public Car(User user, String model) {
        this.user = user;
        this.model = model;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "user=" + user +
                ", model='" + model + '\'' +
                '}';
    }
}
