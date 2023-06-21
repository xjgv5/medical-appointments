public abstract class User {
    private String id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email){
        super();
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() != 8){
            System.out.println("El numero telefonico debe ser de 8 dígitos");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "model.User: " + name + ", Email: " + email +
                "\nAddress: " + address + ", Phone: " + phoneNumber;
    }
    public abstract void showDataUser();
}
