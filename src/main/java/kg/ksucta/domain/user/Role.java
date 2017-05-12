package kg.ksucta.domain.user;

public enum Role {
    ADMIN,
    STUDENT;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}
