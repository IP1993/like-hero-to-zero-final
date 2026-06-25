package beans;

import entities.User;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Named
@RequestScoped
public class LoginBean {

    @PersistenceContext(unitName = "heroPU")
    private EntityManager em;

    private String username;
    private String password;

    @Inject
    private AuthBean authBean;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Transactional
    public String login() {
        try {
            User user = em.createQuery(
                            "SELECT u FROM User u WHERE u.username = :username AND u.password = :password",
                            User.class
                    )
                    .setParameter("username", username)
                    .setParameter("password", password)
                    .getSingleResult();

            // store logged-in user in session
            authBean.setLoggedInUser(user);

            // redirect based on role
            if ("scientist".equals(user.getRole())) {
                return "scientist.xhtml?faces-redirect=true";
            } else {
                return "citizen.xhtml?faces-redirect=true";
            }

        } catch (Exception e) {
            // login failed
            return "login.xhtml?error=true&faces-redirect=true";
        }
    }
}
