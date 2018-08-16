import java.io.*;
import java.util.*;

public class WorkerGenerator {

   private Scanner scanner = new Scanner(System.in);
    private HashMap<String, String> hashMap = new HashMap<String, String>();

    public List<Worker> Generate()  {
        System.out.println("How many workers you want to create?");
        String scan = scanner.nextLine();
        int num =Integer.parseInt(scan);
        List<Worker> workerCards = new ArrayList<Worker>();

        for (int a = 0; a < num; a++){
            setName();
            setAge();
            setSex();
            setExp();
            setJobName();
            int age = Integer.parseInt(hashMap.get("age"));
            int exp = Integer.parseInt(hashMap.get("experience"));
            Worker worker = new Worker(hashMap.get("name"),age,hashMap.get("sex"),exp,hashMap.get("jobname"));
            workerCards.add(worker);
        }

        return workerCards;
    }

/*
    public ArrayList Serarch(){
        ArrayList workerCards = new ArrayList<>(worker);
        new ArrayList<>(Arrays.asList(worker));
        return workerCards;

    }
*/


    public void createData() throws IOException {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        FileInputStream fileStream = new FileInputStream("textFile.txt");
        BufferedReader bReader = new BufferedReader(new InputStreamReader(fileStream));
        String lineReader;
        while (((lineReader = bReader.readLine()) != null) && (lineReader.length() > 0)) {
            String[] tokens = lineReader.split("\\t");
            String key = tokens[1];
            String values = tokens[2] + tokens[3] + tokens[4];
            hashMap.put(key, values);
        }
    }

//    Worker worker = new Worker(hashMap.put(setName(),setAge(),setSex(),setExp(),setJobName()));


    private void setAge() {
        System.out.println("How old are you?");
        String age = scanner.nextLine();
        hashMap.put("age",age);
    }

    protected boolean sortAge(String integerCache) {

        int result = Integer.parseInt(integerCache);
        if (result <= 18 || result >= 40) {
            System.out.println("Sorry, yor age not accepted");
            return false;
        }
        System.out.println("This age accepted!");
        return true;
    }

    protected boolean sortExp(String integerCache) {

        int result = Integer.parseInt(integerCache);
        if (result <= 2 || result >= 20) {
            System.out.println("Sorry, your age not accepted");
            return false;
        }
        System.out.println("Nice opportunity, good setExp!");
        return true;
    }

    private void setSex() {
        System.out.println("Chose your sex: Men/Woman");
        String cache = scanner.nextLine();
        if (Objects.equals(cache, "Men")) {
            System.out.println("--- It's grate!");


        } else if (Objects.equals(cache, "Woman")) {
            System.out.println("-- Sorry, will continue to work");
        } else {
            System.out.println("-- Unknown command!");
        }
        hashMap.put("sex",cache);
    }

    private void setName() {
        System.out.println("Hello! What is your name?");
        String cache = scanner.nextLine();
        System.out.println("Nice to meet you " + cache);
        hashMap.put("name", cache );
    }

    private void setJobName() {
        System.out.println("Which name of company where you worked?");
        String cache = scanner.nextLine();
        System.out.println("Never heard about them. But you need us! Welcome");
        hashMap.put("jobname",cache);
    }

    private void setExp() {
        System.out.println("Do you have job setExp. How many years?");
        String exp = scanner.nextLine();
        hashMap.put("experience",exp);
    }



}
