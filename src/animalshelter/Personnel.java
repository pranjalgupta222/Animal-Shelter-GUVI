
package animalshelter;

public class Personnel {
    private String name;
    private String password;
    private boolean authority;
    
    public Personnel(String name, String password, boolean authority) {
        this.name = name;
        this.authority = authority;
        this.password = password;
    }

    public Personnel(String username, String password) {
        this.name = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getAuthority() {
        return authority;
    }

    public void setAuthority(boolean authority) {
        this.authority = authority;
    }

    //check name = admin && password = admin 
    public boolean equals(Personnel personnel) {
        if(personnel.getName().equals("admin") && personnel.getPassword().equals("admin")){
            return true;
        }
        return false;
    }    
}