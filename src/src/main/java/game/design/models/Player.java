package game.design.models;

public abstract class Player {
    private String name;
    private Integer id;
    private String level;
    private String rating;
    public abstract void MakeMove();
}
