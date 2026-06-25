package beans;

import entities.User;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class AuthBean implements Serializable {

    private User loggedInUser;

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(User user) {
        this.loggedInUser = user;
    }

    public boolean isScientist() {
        return loggedInUser != null && "scientist".equals(loggedInUser.getRole());
    }

    public boolean isCitizen() {
        return loggedInUser != null && "citizen".equals(loggedInUser.getRole());
    }

    public String logout() {
        loggedInUser = null;
        return "index.xhtml?faces-redirect=true";
    }
}
