package ucu.apps.demo.observer;

import ucu.apps.demo.order.Order;

import java.util.List;

public class OrderObserver {
    private Order order = new Order();
    private List<User> users;

    public OrderObserver(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers() {
        for (User user: users) {
            user.update(order.getStatus());
        }
    }

    public void changeStatus(Status status) {
        order.setStatus(status);
        notifyUsers();
    }
}
