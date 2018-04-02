package spittr;

import javax.validation.constraints.*;
import org.apache.commons.lang3.builder.*;

public class Spitter {
    private Long id;

    @NotNull
    @Size(min = 5, max = 20)
    private String username;

    @NotNull
    @Size(min = 6, max = 16)
    private String password;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min = 2, max = 20)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 20)
    private String lastName;

    @NotNull
    @Size(min = 6, max = 15)
    private String tel;

    public Spitter(Long id, String username, String password, String firstName, String lastName, String email, String tel) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.tel = tel;
    }

    public Spitter() { }

    public Spitter(String username, String password, String firstName, String lastName, String email, String tel) {
        this(null, username, password, firstName, lastName, email, tel);
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "id","firstName", "lastName", "username", "password", "email", "tel");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "firstName", "lastName", "username", "password", "email", "tel");
    }
}
