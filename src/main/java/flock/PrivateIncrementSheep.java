package flock;

public class PrivateIncrementSheep extends PrivateIncrementSheepInternal {
    public PrivateIncrementSheep(String name) {
        super(name);
    }
}

class PrivateIncrementSheepInternal extends Sheep{ //Класс недоступен вне пакета.
    private static int counter = 1;
    private static int getNextId(){
        return counter++;
    }
    public PrivateIncrementSheepInternal(String name) {
        super(getNextId(), name);
    }
    @Override
    public String getName() {
        return "Инкрементриуемая овца с хорошо защищённым счётчиком " + name;
    }

}
