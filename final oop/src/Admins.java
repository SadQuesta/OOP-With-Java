
import java.io.Serializable;


public class Admins  implements Serializable {
    private String AdminName;
    private String AdminPass;

    public Admins(String AdminName, String AdminPass) {
        this.AdminName = AdminName;
        this.AdminPass = AdminPass;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    public String getAdminPass() {
        return AdminPass;
    }

    public void setAdminPass(String AdminPass) {
        this.AdminPass = AdminPass;
    }
    
    
    
    

    
    
    
     
}
