import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("test.csv");

        String[] headers = {"ВысотаДомов1", "ВысотаДомов2", "ВысотаДомов3"};

        int[][] data = {
                {15, 20, 30},
                {75, 60, 65},
                {10, 20, 15},
        };

        AppData appData = new AppData(headers, data);

        appData.save(file);
        appData.load(file);
        appData.readAppData();
    }
}
