import flock.*;

public class Main {
    public static void main(String[] args) {

        Sheep simple1 = new SimpleSheep(1, "Simple1");
        Sheep simple2 = new SimpleSheep(2, "Simple2");
        System.out.println(simple1);
        System.out.println(simple2);

        Sheep publicSheep1 = new PublicIncrementSheep("publicSheep1");
        Sheep publicSheep2 = new PublicIncrementSheep("publicSheep2");
        System.out.println(publicSheep1);
        System.out.println(publicSheep2);

        PublicIncrementSheep.counter = 123; // Счётчик можно испортить даже отсюда.
        Sheep publicSheep3 = new PublicIncrementSheep("publicSheep3");
        System.out.println(publicSheep3);

        Sheep protectedSheep1 = new ProtectedIncrementSheep("protectedSheep1");
        Sheep protectedSheep2 = new ProtectedIncrementSheep("protectedSheep2");
        System.out.println(protectedSheep1);
        System.out.println(protectedSheep2);
        // ProtectedIncrementSheep.counter = 123; // Счётчик испортить не получится, поле защищено на уровне пакета.

        Sheep cheaterSheep1 = new ProtectedIncrementCheaterSheep("cheaterSheep1");
        Sheep cheaterSheep2 = new ProtectedIncrementCheaterSheep("cheaterSheep2");
        Sheep cheaterSheep3 = new ProtectedIncrementCheaterSheep("cheaterSheep3");
        System.out.println(cheaterSheep1);
        System.out.println(cheaterSheep2);
        System.out.println(cheaterSheep3);

        Sheep privateSheep1 = new PrivateIncrementSheep("privateSheep1");
        Sheep privateSheep2 = new PrivateIncrementSheep("privateSheep2");
        System.out.println(privateSheep1);
        System.out.println(privateSheep2);
    }

    //TODO: Создать JAVADOC и прокомментировать код.
}
