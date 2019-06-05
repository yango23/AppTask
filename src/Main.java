import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String commanndString = br.readLine();
        FileWriter writer = new FileWriter("out.txt", true);
        Map<Integer, AppInf> dataBase = new HashMap<>();


        //предполагаемая проверка на finish
        /*while (!"finish".equals(commanndString)) {
            commanndString = br.readLine();
        }
        String commanndString = "add 1, Marokko, 375, Kabyshev.G.V, 14.05.2019, finish";*/

        String[] operation = commanndString.split(" ", 2);
        String[] restString = operation[1].split(", ");
        switch (operation[0]) {
            case "add":
                AppInf appInf = new AppInf();

                appInf.setId(Integer.parseInt(restString[0]));

                appInf.setFlyNumber(restString[1]);

                appInf.setDestination(restString[2]);

                appInf.setName(restString[3]);

                appInf.setFlyDate(restString[4]);
                dataBase.put(appInf.getId(), appInf);

                String bufAdd = operation[1];
                writer.write(bufAdd);
                writer.append('\n');
                String bufBaseAdd = appInf.toString();
                writer.write(bufBaseAdd);
                writer.close();
                break;


            case "delete":
                dataBase.remove(Integer.parseInt(restString[0]));
                break;

            case "update":
                AppInf appInfRep = new AppInf();

                appInfRep.setId(Integer.parseInt(restString[0]));

                appInfRep.setFlyNumber(restString[1]);

                appInfRep.setDestination(restString[2]);

                appInfRep.setName(restString[3]);

                appInfRep.setFlyDate(restString[4]);
                dataBase.replace(appInfRep.getId(), appInfRep);

                String bufBaseUpd = dataBase.toString();
                writer.write(bufBaseUpd);
                writer.close();
                break;
        }
    }

}
