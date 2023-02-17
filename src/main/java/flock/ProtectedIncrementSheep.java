package flock;

/**
 * В данной реализации счётчик доступен только самим овцам и их потомкам.
 */
public class ProtectedIncrementSheep extends Sheep{
    protected static int counter = 1; //Доступен только из данного класса и его наследников.

    public ProtectedIncrementSheep(String name) {
        super(counter++, name);
    }

    @Override
    public String getName() {
        return "Инкрементриуемая овца с частично защищённым счётчиком " + name;
    }
}
