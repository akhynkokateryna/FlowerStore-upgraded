package ucu.apps.demo.observer;

import ucu.apps.demo.AppUser.AppUser;

public class Sender extends AppUser implements User{
    private Status status;
    private AppUser user = new AppUser();
    @Override
    public void update(Status status) {
        this.status = status;
    }
}
