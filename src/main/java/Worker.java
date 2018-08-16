public class Worker  extends Man{

    private int experience;
    private final String jobName;

    public Worker(String name, int age, String sex, int experience, String jobName) {
        super(name, age, sex);
        this.experience = experience;
        this.jobName = jobName;
    }


    public int getExperience() {
        return experience;
    }

    public String getJobName() {
        return jobName;
    }

}
