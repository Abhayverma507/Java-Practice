package Practice;


class Animal{
    int numOdAnimal;

    public int getNumOdAnimal() {
        return numOdAnimal;
    }

    public void setNumOdAnimal(int numOdAnimal) {
        this.numOdAnimal = numOdAnimal;
    }

    public void printAnimal(){
        System.out.println("This is Animal");
    }
}
class Dog extends Animal{
    int numOfDog;

    public int getNumOfDog() {
        return numOfDog;
    }

    public void setNumOfDog(int numOfDog) {
        this.numOfDog = numOfDog;
    }

    public void dogSound(){
        System.out.println("Bhaoooooooo......");
    }

}

public class Inheritance1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setNumOdAnimal(2);
         animal.printAnimal();
        System.out.println("Number od animal = "+animal.getNumOdAnimal());

         Dog dog = new Dog();
          dog.setNumOfDog(5);
        System.out.println("Number of Dog = "+dog.getNumOfDog());
        dog.dogSound();

    }


}
