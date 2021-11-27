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
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public void setSex(Gender sex) {
        super.setSex(sex);
    }

    @Override
    public String toString() {
        return " Student{ " + super.toString() +
                " gropeName='" + gropeName + '\'' +
                ", id=" + id +
                " }\n";
    }
    public void readStudent () {
        String[] str = new String[5];
        str = InputStudent.input();
        try {
            this.setName(str[0]);
            this.setLastName(str[1]);
            this.setSex(Gender.valueOf(str[2].toUpperCase()));
            this.setGropeName(str[3]);
            this.setId(Long.parseLong(str[4]));
        }
        catch (IllegalArgumentException e) {
            System.out.println("Check entered data!");
        }
    }
}
