public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages = 25;

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }



    public void displayZoo() {
        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
        System.out.println("Animals in the Zoo:");
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name + ", Family: " + animal.family);
        }
    }
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}