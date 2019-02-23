package son.kwanyoung.pusherpusher;

import de.siegmar.fastcsv.reader.*;
import de.siegmar.fastcsv.writer.*;
import java.io.*;
import java.nio.charset.*;

class PusherPusher {
    public static void main(String args[]) {
        File file = new File("/home/kws/hellocsv.csv");
        CsvReader csvReader = new CsvReader();

        try {
            CsvParser csvParser = csvReader.parse(file, StandardCharsets.UTF_8);
            CsvRow row;
            while((row = csvParser.nextRow()) != null) {
                System.out.println("Read line: " + row);
                System.out.println("First column of line: " + row.getField(0));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
