public enum Role {
    DEFENDER("Защитник"),
    ATTACKER("Нападающий"),
    GOALKEEPER("Вратарь"),
    MIDFIELDER("Полузащитник");

    private final String role;
    Role(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
