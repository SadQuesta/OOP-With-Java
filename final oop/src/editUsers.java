
import java.util.Objects;


public class editUsers extends Users{
    private Users users;

    public editUsers(Users users, String UserName, String Password) {
        super(UserName, Password);
        this.users = users;
    }

    

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

   
}
