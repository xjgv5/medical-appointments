import javax.print.Doc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor();
        doctor1.name = "Alejandro Rodríguez";
        doctor1.showName();
        doctor1.showID();

        Doctor doctor2 = new Doctor();
        doctor2.showID();

        UIMenu.showMenu();

    }


}