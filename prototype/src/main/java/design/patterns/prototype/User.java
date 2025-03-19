package design.patterns.prototype;

import lombok.Data;

import java.util.UUID;

@Data
public class User implements Prototype {

    private UUID id;
    private String email;
    private String password;
    private String username;

    @Override
    public Prototype clone() {
        return new User(this);
    }

    public User(){

    }

    public User(User user){
        this.id = user.id;
        this.email = user.email;
        this.username = user.username;
        this.password = user.password;
    }
}
