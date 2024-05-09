
package animal;


public class Dog extends Animal{
    
    
    private  String breed;

    public Dog() {
    }

   
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String breed, String name, int age) {
        super(name, age);
        this.breed = breed;
    }

    
    @Override
    public void makeSound() {
        System.out.println("Woof");
        System.out.println("Name is "+super.getName()+" age is "+super.getAge()
        +" breed is "+ this.breed);
    }
    
    
}
