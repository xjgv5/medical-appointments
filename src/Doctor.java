import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
   private String speciality;


    public Doctor(String name, String email){
        super(name, email);
        //System.out.println("Nombre: " + name);
        this.speciality = speciality;
    }

    //Métodos
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setAvailableAppointments(ArrayList<AvailableAppointment> availableAppointments) {
        this.availableAppointments = availableAppointments;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    @Override
    public String toString() {
        return super.toString() + "\n Especialidad: " + speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: ");
        System.out.println("Departamento: ");
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }


    }
}
