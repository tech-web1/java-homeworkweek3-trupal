package homework;

public class Programme14 {String firstname, lastname;
    int age;

    public static void main(String[] args) {
        Programme14 person = new Programme14();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(18);
        System.out.println("FullName = " + person.getFullname());
        System.out.println("Teen = " + person.isTeen());
        person.setFirstName("John");
        System.out.println("Teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("FullName = " + person.getFullname());
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullname(){
        if (firstname.isEmpty() && lastname.isEmpty()){
            return " ";
        } else if (firstname.isEmpty()) {
            return getLastname();
        } else if (lastname.isEmpty()) {
            return getFirstname();
        }else {
            return getFirstname() + " " + getLastname();
        }
    }
}


