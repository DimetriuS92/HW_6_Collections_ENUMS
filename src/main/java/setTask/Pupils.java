package setTask;

public class Pupils implements Comparable <Pupils> {
    private int mark;
    private String form;
    private static String name;



    public Pupils(int mark, String form, String name) {
        this.mark = mark;
        this.form = form;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Pupils{" +
                "mark=" + mark +
                ", form='" + form + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pupils pupils) {
        return this.name.compareTo(Pupils.name);
    }
}
