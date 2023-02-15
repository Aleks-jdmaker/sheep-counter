package flock;

public class PublicIncrementSheep extends Sheep{
    public static int counter = 1;

    public PublicIncrementSheep(String name) {
        super(counter++, name);
    }

    @Override
    public String getName() {return "Инкрементриуемая овца с публичным счётчиком " + name;
    }
}
