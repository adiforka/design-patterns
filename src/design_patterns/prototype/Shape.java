package design_patterns.prototype;

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /*important: when asked for an instance in getShape, it finds the concrete shape in question and uses this to clone
    and return it
     */
    @Override
    public Shape clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Shape) clone;
    }
}
