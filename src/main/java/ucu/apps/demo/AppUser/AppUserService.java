package ucu.apps.demo.AppUser;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {
    private AppUserRepository appUserRepository;

    public List<AppUser> getAppUsers() {
        return appUserRepository.findAll();
    }

    public void addAppUser(AppUser appUser) {
        if (appUserRepository.findAppUserByEmail(appUser.getEmail()).isEmpty()) {
            appUserRepository.save(appUser);
        }
    }
}
