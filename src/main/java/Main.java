import javafx.scene.control.Tab;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

//        WorkerGenerator workerGenerator = new WorkerGenerator();
//        workerGenerator.createData();


        WorkerGenerator workerGenerator = new WorkerGenerator();
        SerchWorker serchWorker = new SerchWorker(workerGenerator.Generate());
        serchWorker.Search();


    }

}
