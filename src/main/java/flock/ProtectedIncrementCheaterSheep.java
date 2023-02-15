package flock;

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
