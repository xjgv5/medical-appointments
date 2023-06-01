public class Doctor {
    static int id = 0; //Autoincremental
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto doctor");
    }
    Doctor(String name, String speciality){
        System.out.println("Nombre: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Métodos
    public void showName(){
        System.out.println(name);
    }

    public void showID(){
        System.out.println("ID Doctor: " + id);
    }


}
