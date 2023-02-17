package flock;

/**
 * Пример вредоносного кода, сбивающего последовательность чисел в счётчике и нарушаещего уникальность идентификаторов.
 */
public class ProtectedIncrementCheaterSheep extends ProtectedIncrementSheep {
    public ProtectedIncrementCheaterSheep(String name) {
        super(name);
        counter--;
    }

    @Override
    public String getName(){
        return "Инкрементриуемая овца-вредитель " + name;
    }
}
