package study;

public class Student extends Person implements CSVConverter {
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

    @Override
    public Student fromCSVString(String str) {
        String[] studentString = new String[5];
        studentString = InputStudent.fromCSV(str);
        return InputStudent.fill(studentString);
    }

    public Student fromKeyboard() {
        String[] studentString = new String[5];
        studentString = InputStudent.fromKB();
        return InputStudent.fill(studentString);
    }

    @Override
    public String toCSVString() {
        String str = new String();
        str =   this.getName() + ';' +
                this.getLastName() + ';' +
                this.getSex() + ';' +
                this.getGropeName()  + ';' +
                this.getId()  + ";\n";
        return str;
    }
}
