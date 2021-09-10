package animal;

public class AnimalMove {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Chien();
        Animal a3 = new Pigeon();

        a1.deplacer();
        a2.deplacer();
        a3.deplacer();
    }

}
