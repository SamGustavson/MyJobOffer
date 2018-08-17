import java.util.*;

public class SerchWorker {

    Scanner scanner = new Scanner(System.in);
    private List<Worker> workerList;
    SerchWorker(List<Worker> worker) {
        workerList = worker;
    }



//
//    private void Supper () {
////        System.out.println(Arrays.toString(workerGenerator.Generate().toArray()));
//        for (Map.Entry<String, String> e : workerGenerator.) {
//            Set<String> targetSet = new HashSet<>(e);
//
//            for (String e1 : targetSet) {
//                System.out.println(e.getKey() + "=" + e1);
//            }
//        }
//    }

    private boolean search(String nameCategory, String vaule){


        for (Worker s : workerList){
            String []succsess = {"Name","Age","Sex","Experience","JobName"};
           
            switch (nameCategory.toLowerCase()){
                case "experience" : s.toString().contains(vaule);
                    return s.toString().contains(vaule);
//                    break;

                case "jobName" :
                    System.out.println("Job Name is" + s.getJobName().contains(vaule));
                    return s.getJobName().contains(vaule);
//                    break;
                case "name" :
                    System.out.println(s.getName().toLowerCase().contains(vaule));
                    return s.getName().contains(vaule);
//                    break;
                case "age" :
                    System.out.println(s.toString().contains(vaule));
                    return s.toString().contains(vaule);
//                    break;
                case "sex" :
                    System.out.println(s.getSex().contains(vaule));
                    return s.getSex().contains(vaule);
//                    break;
                default:
                    System.out.println("--Unknown command!");
            }
        }


        return false;
    }
    public void Search() {
        System.out.println("-- Chose category (Example: 1 - experience or 2 -jobName)");
        String inputCategory = scanner.nextLine();
        System.out.println("-- Enter value of category (Example: epam)");

        String inputVaulle = scanner.nextLine();

        search(inputCategory,inputVaulle);

//        Worker james = workerList.stream().filter(workerList ->inputCategory.equals(workerList.getJobName())).findAny().orElse();


        List<String> list = Arrays.asList(workerList.toArray().toString());

        boolean match = list.stream().allMatch(s -> inputCategory.contains(s));
        System.out.println(match);



    }
}

