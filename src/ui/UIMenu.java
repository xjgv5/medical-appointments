package ui;


import java.util.ArrayList;
import java.util.Scanner;


public class UIMenu {

    public static String[] MONTHS = {
      "Enero",
      "Febrero",
      "Marzo",
      "Abril",
      "Mayo",
      "Junio",
      "Julio",
      "Agosto",
      "Septiembre",
      "Octubre",
      "Noviembre",
      "Diciembre"
    };
    public static  Doctor doctorLogged;
    public static  Patient patientLogged;


    public static void showMenu(){
        int response = 0;
        System.out.println("Bienvenido al sistema de citas");
        System.out.println("Selecciona la opción deseada");

        do{
            System.out.println("1.- Doctor");
            System.out.println("2.- Paciente");
            System.out.println("0.- Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    response = 0;
                    break;
                case 2:
                    response=0;
                    showPatientMenu();
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Gracias por tu visita");
                    break;
                default:
                    System.out.println("Ingresa una opción válida");
            }
        } while (response!=0);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n \n");
            System.out.println("Paciente");
            System.out.println("1.- Agendar una cita");
            System.out.println("2.- Ver mis citas");
            System.out.println("0.- Regresar");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Agenda una cita");
                    for (int i = 1; i < 3; i++) {
                        System.out.println(i + ".- " + MONTHS[i - 1]);
                    }
                    break;
                case 2:
                    System.out.println("Mis citas");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while (response != 0);
    }
    private static void authUser(int userType){
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martínez", "alejandro@email.com"));
        doctors.add(new Doctor("Karen Sosa", "karen@email.com"));
        doctors.add(new Doctor("Rocio Gómez", "rocio@email.com"));

        ArrayList<Patient> patients = new ArrayList<Patient>();
        patients.add(new Patient("Claudia Sanchez", "claudia@email.com"));
        patients.add(new Patient("Claudia Sanchez", "claudia@email.com"));
        patients.add(new Patient("Claudia Sanchez", "claudia@email.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Ingresa tu correo: ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1){
                for(Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect = true;
                        //obtener los datos del usuario
                        doctorLogged = d;
                        //show doctor menu

                    }
                }
            }
            if(userType == 2){
                for (patients p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect = true;
                        //obtener los datos del usuario
                        doctorLogged = d;
                        //show doctor menu
                    }
                }
            }
        }while (!emailCorrect);

    }
}
