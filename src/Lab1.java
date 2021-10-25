import java.time.LocalDate;
import java.util.*;

public class Lab1 {

    public static LocalDate parseStringToLocalDateFormat(String str){
        String[] strDate = str.split("\\.");
        LocalDate date;
        if(strDate.length == 3){
            int day = Integer.parseInt(strDate[0]);
            int month = Integer.parseInt(strDate[1]);
            int year = Integer.parseInt(strDate[2]);
            date = LocalDate.of(year, month , day);
        }
        else{
            throw new Error("Incorrect date format.");
        }
        return date;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        FootballClub footballClub = new FootballClub();

        Footballer footballer;
        LocalDate dateOfBirth;
        System.out.print("Введите количество футболистов:");
        int length = scanner.nextInt();
        for(int i = 0; i < length; i++) {
            System.out.println("Футболист №" + (i+1) + ":");
            footballer = new Footballer();
            System.out.print("Фамилия: ");
            footballer.setLastName(scanner.next());
            System.out.print("Дата рождения(в формате дд.мм.гггг): ");
            dateOfBirth = parseStringToLocalDateFormat(scanner.next());
            footballer.setDateOfBirth(dateOfBirth);
            System.out.print("Место рождения: ");
            footballer.setBirthLocation(scanner.next());
            System.out.print("Роль: ");
            footballer.setRole(scanner.next());
            System.out.print("Количество игр: ");
            footballer.setGamesNumber(scanner.nextInt());
            System.out.print("Количество желтых карточек: ");
            footballer.setYellowCardNumber(scanner.nextInt());
            footballClub.add(footballer);
        }

        FootballClub.printFootballerData(footballClub);
    }
}
