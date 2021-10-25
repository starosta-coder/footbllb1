import java.time.LocalDate;
import java.util.Calendar;

public class Footballer {
    private String lastName;
    private LocalDate dateOfBirth;
    private String birthLocation;
    private Role role;
    private int gamesNumber;
    private int yellowCardNumber;

    public int getGamesNumber() {
        return gamesNumber;
    }

    public void setGamesNumber(int gamesNumber) {
        if(gamesNumber >= 0) {
            this.gamesNumber = gamesNumber;
        }
        else{
            throw new Error("gamesNumber must be more than 0 or equals 0.");
        }
    }

    public int getYellowCardNumber() {
        return yellowCardNumber;
    }

    public void setYellowCardNumber(int yellowCardNumber) {
        if(yellowCardNumber >= 0) {
            this.yellowCardNumber = yellowCardNumber;
        }
        else{
            throw new Error("yellowCardNumber must be more than 0 or equals 0.");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
        else{
            throw new Error("lastName must not be empty.");
        }
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBirthLocation() {
        return birthLocation;
    }

    public void setBirthLocation(String birthLocation) {
        if(birthLocation != null && !lastName.isEmpty()) {
            this.birthLocation = birthLocation;
        }
        else{
            throw new Error("birthLocation must not be empty.");
        }
    }

    public Role getRole() {
        return role;
    }

    public void setRole(String role) {
        switch (role){
            case "защитник":
                this.role = Role.DEFENDER;
                break;
            case "нападающий":
                this.role = Role.ATTACKER;
                break;
            case "вратарь":
                this.role = Role.GOALKEEPER;
                break;
            case "полузащитник":
                this.role = Role.MIDFIELDER;
                break;
            default:
                throw new Error("role must be one of four values: 'защитник', 'нападающий', 'вратарь', 'полузащитник'.");
        }
    }

    
}
