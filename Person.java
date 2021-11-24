package study;

public class Person {
    private String name;
    private String lastName;
    private Gender sex;

    public Person() {
    }

    public Person(String name, String lastName, Gender sex) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return " Person{ " +
                " name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                " }";
    }
}
