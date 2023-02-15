package flock;

public class SimpleSheep extends Sheep{
    public SimpleSheep(int id, String name) {
        super(id, name);
    }
    @Override
    public String getName() {return "Простая овца " + name;}
}
