import ui.UIMenu;

import java.util.ArrayList;
import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Anahi Slagado", "example@mail.com");
        doctor1.addAvailableAppointment(new Date(), "4pm");
        doctor1.addAvailableAppointment(new Date(), "2pm");
        doctor1.addAvailableAppointment(new Date(), "6pm");

    }


}