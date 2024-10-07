public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages = 25;
//compteur d'animaux
    int Count = 0 ;
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

    public boolean addAnimal(Animal animal) {
        if (Count < nbrCages) {
            animals[Count] = animal;
            Count++;
            return true;
        } else {
            return false;
        }
    }

public void displayAnimals() {
    for (int i = 0; i < Count; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < Count; i++) {
            if (animals[i].name==animal.name) {
                return i;
            }
        }
        return -1;  // Retourner -1 si non trouvé
    }






}