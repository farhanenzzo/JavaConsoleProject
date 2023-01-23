public class Student extends Department{

    private String name;
    private int id;
    private int contact;
    private String email;
    Student(String name, int id, String email, int contact) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public int getContact() {
        return contact;
    }

    public String toString() {
        return "Name: ("+ name + ")Id: (" + id + ")Email: (" + email + ")Contact (" + contact+ ")";
    }

}
