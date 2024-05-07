
package phone;


public class Student {
    
    private String name;
    private String email;
    private String cellNumber;

    public Student() {
    }

    public Student(String name, String email, String cellNumber) {
        this.name = name;
        this.email = email;
        this.cellNumber = cellNumber;
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

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + ", cellNumber=" + cellNumber + '}';
    }
    
    
    
}
