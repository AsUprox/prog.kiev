package study;

public class Student extends Person {
    private String gropeName;
    private long id;

    public Student() {
        super();
    }

    public Student(String name, String lastName, Gender sex, String gropeName, long id) {
        super(name, lastName, sex);
        this.gropeName = gropeName;
        this.id = id;
    }

    public String getGropeName() {
        return gropeName;
    }

    public long getId() {
        return id;
    }

    public void setGropeName(String gropeName) {
        this.gropeName = gropeName;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " Student{ " + super.toString() +
                " gropeName='" + gropeName + '\'' +
                ", id=" + id +
                " }\n";
    }
}
