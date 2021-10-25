import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FootballClub {
    private ArrayList<Footballer> footballers = new ArrayList<>();

    public FootballClub(){

    }

    public void add(Footballer footballer) {
        footballers.add(footballer);
    }

    public int size() {
        return footballers.size();
    }


    public static void printFootballerData(FootballClub club){
        System.out.println("Все футболисты, старше 20-лет и получающих не более 1 карточки за 10 игр.");
        int i = 0;
        LocalDate currentDate = LocalDate.now();
        for(Footballer footballer: club.footballers){
            int age = getTotalYears(footballer.getDateOfBirth(), currentDate);
            double averageYellowCardNumber = getAverageYellowCardNumber(footballer);

            if(age > 20 && averageYellowCardNumber <= 1) {
                System.out.println("Футболист №" + (i + 1) + ":");
                System.out.println("Фамилия: " + footballer.getLastName());
                System.out.println("Дата рождения: " + DateTimeFormatter.ofPattern("dd.MM.yyyy").format(footballer.getDateOfBirth()));
                System.out.println("Место рождения: " + footballer.getBirthLocation());
                System.out.println("Роль: " + footballer.getRole().getRole());
                System.out.println("Количество игр: " + footballer.getGamesNumber());
                System.out.println("Количество желтых карточек: " + footballer.getYellowCardNumber());
            }
            i++;
        }
    }

    private static double getAverageYellowCardNumber(Footballer footballer) {
        return 10 * (double)footballer.getYellowCardNumber() / footballer.getGamesNumber();
    }

    private static int getTotalYears(LocalDate startDate, LocalDate finishDate) {
        int years = finishDate.getYear() -  startDate.getYear();
        if(startDate.getMonth().getValue() > finishDate.getMonth().getValue()){
            years--;
        }
        else if(startDate.getDayOfMonth() > finishDate.getDayOfMonth()){
            years--;
        }
        return years;
    }

}
