public class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    public void showRole() {
        System.out.println(name + " is an Admin");
    }
}