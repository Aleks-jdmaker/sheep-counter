package flock;

/**
 * Счётчик в данном классе реализован как публичное статическое поле. Даёт возможность автоматически
 * инкрементировать значение, но доступен из любого пакета как на чтение, так и на запись.
 */
public class PublicIncrementSheep extends Sheep{
    public static int counter = 1;

    public PublicIncrementSheep(String name) {
        super(counter++, name);
    }

    @Override
    public String getName() {return "Инкрементриуемая овца с публичным счётчиком " + name;
    }
}
