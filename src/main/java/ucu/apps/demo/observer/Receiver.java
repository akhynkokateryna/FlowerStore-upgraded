package ucu.apps.demo.observer;

import ucu.apps.demo.AppUser.AppUser;

public class Receiver extends AppUser implements User{
    private Status status;
    private final AppUser user = new AppUser();
    @Override
    public void update(Status status) {
        this.status = status;
    }
}
