
import java.io.Serializable;
import java.util.Objects;

public class Users  implements Serializable {
    
    public String UserName;
    private String Password;
    

    public Users(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;
    }
    public boolean equals(Users user){
        return (this.UserName.equals(user.UserName) && 
                this.Password.equals(user.Password));
    }
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    

   

   
}
