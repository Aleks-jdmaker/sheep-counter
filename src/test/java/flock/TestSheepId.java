package flock; // Тест и тестируемая сущность должны находиться в одном пакете.

import static org.junit.jupiter.api.Assertions.*; // Статический импорт, позволяет забрать полезные методы
                                                  // и пользоваться ими как собственными, в рамках данного класса.
import org.junit.jupiter.api.Test;

class TestSheepId {

    @Test
    void testPrivateIncrementSheep () {
        Sheep sheep1 = new ProtectedIncrementSheep("Dolly");
        Sheep sheep2 = new ProtectedIncrementSheep("Arnold");
        assertNotEquals(sheep1.getId(), sheep2.getId());
        //PrivateIncrementSheep.counter = 1; // Не получится испортить счётчик, т.к. он приватный.
        Sheep sheep3 = new ProtectedIncrementCheaterSheep("Dolly");
        Sheep sheep4 = new ProtectedIncrementSheep("Arnold");
        assertEquals(3, sheep3.getId());
        assertEquals(3, sheep4.getId());
        //assertNotEquals(sheep4.getId(), sheep3.getId()); //Тест не пройдёт, счётчик испорчен.
    }
    @Test
    void testPublicIncrementSheep () {
        Sheep sheep1 = new PublicIncrementSheep("Dolly");
        Sheep sheep2 = new PublicIncrementSheep("Arnold");
        assertNotEquals(sheep1.getId(), sheep2.getId());
        PublicIncrementSheep.counter = 1; // Целенаправленно портим счётчик.
        Sheep sheep3 = new PublicIncrementSheep("Dolly");
        Sheep sheep4 = new PublicIncrementSheep("Arnold");
/*        assertNotEquals(sheep1.getId(), sheep3.getId()); //Тесты не пройдут, счётчик испорчен.
        assertNotEquals(sheep2.getId(), sheep4.getId());*/
    }

    @Test
    void testSimpleSheepId () {
        Sheep sheep1 = new SimpleSheep(1, "Dolly");
        Sheep sheep2 = new SimpleSheep(2, "Arnold"); //Тест выполняется успешно, только потому, что id указан вручную.
        assertNotEquals(sheep1.getId(), sheep2.getId());
    }
}
