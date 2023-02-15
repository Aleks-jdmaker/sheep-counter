package flock;

public abstract class Sheep {
    private int id; //Доступно для изменения ТОЛЬКО из текущего класса.
    protected String name; //Доступно для изменения из классов наследников.
    public final static String emoji = "\uD83D\uDC11"; //Поле доступно для чтения всем пакетам, но поменять его нельзя.
    public Sheep(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) throws IllegalAccessException{
        throw new IllegalAccessException("Нельзя менять идентификатор!");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return new StringBuilder(emoji)
                .append(getName())
                .append(". Номер ")
                .append(id)
                .append(".").toString();
    }
}
