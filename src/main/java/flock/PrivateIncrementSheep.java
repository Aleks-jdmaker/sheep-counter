package flock;

/**
 * Пара классов, в одном из которых (PrivateIncrementSheepInternal) счётчик полностью закрыт от внешних влияний.
 *
 * Класс потомок (PrivateIncrementSheep) - никак не может повлиять на счётчик.
 */
public class PrivateIncrementSheep extends PrivateIncrementSheepInternal {
    public PrivateIncrementSheep(String name) {
        super(name);
    }
}

/**
 * Закрытый класс, созданный для защиты счётчика.
 */
class PrivateIncrementSheepInternal extends Sheep{ //Класс недоступен вне пакета. Пакетный доступ.
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
