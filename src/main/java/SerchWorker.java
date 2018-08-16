import com.sun.javafx.geom.Edge;

import java.util.*;

public class SerchWorker {

    Scanner scanner = new Scanner(System.in);
    private List<Worker> workerList;
    private SerchWorker(List<Worker> worker) {
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

    private Collection<String> search(String vaule){
        List<String> founds = new ArrayList<String>();

        for (Worker s : workerList){
            if (s.equals(vaule)){

                System.out.println("We found :"+ s);
            }
        }
        return founds;
    }

    public void Search() {
        System.out.println("-- Enter searchByText to find contacts card (Example: experience or jobName)");
        String inputCategory = scanner.nextLine();
        String inputVaulle = scanner.nextLine();

//        Worker james = workerList.stream().filter(workerList ->inputCategory.equals(workerList.getJobName())).findAny().orElse();

        List<String> list = Arrays.asList(workerList.toArray().toString());

        boolean match = list.stream().allMatch(s -> inputCategory.contains(s));
        System.out.println(match);

//
//        for (Worker searchResult : workerList ){
//            for (List<String> worker :searchResult.getJobName() ){
//                if ()
//            }
//        }

    }
}

