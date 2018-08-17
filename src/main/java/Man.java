public class Man {

    private final String name;
    private int age;
    private final String sex;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Man(String name, int age, String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;

    }

}
