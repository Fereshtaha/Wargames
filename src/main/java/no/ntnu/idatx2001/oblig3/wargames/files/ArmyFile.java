package no.ntnu.idatx2001.oblig3.wargames.files;

import no.ntnu.idatx2001.oblig3.wargames.*;

import java.io.*;

public class ArmyFile {

    /**
     * Skriver inn en hær til fila. Metoden gjør det mulig å lagre en armé i en fil.
     * @param army hæren som skal legges til
     * @throws IOException kaster en exception, som blir kastet videre
     */
//isFile File file = new File(nameOfArmy + ".csv")
    public static void writeArmyToFile(Army army) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(army.getName() + ".csv"))){
            writer.write(army.getName());
            writer.newLine();
            for (Unit b : army.getAllUnits()) {
                String comma = ", ";
                writer.write(b.getClass().getSimpleName() + comma + b.getName() + comma + b.getHealth());
                writer.newLine();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /**
     * Metoden gjør det mulig å lese fra en fil.
     * @param army armyen som ble lagt til
     * @throws FileNotFoundException exception som blir sendt
     */
    public static void readFromFile(Army army) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader(army.getName() + ".csv"))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Army army = DummyDataInitalizr.makeDefaultArmy("Yolo squad");
        try {
            writeArmyToFile(army);
        } catch (IOException e) {
            System.err.println("Could not write army to file");
        }
        try {
            readFromFile(army);
        } catch (IOException e) {
            System.err.println("Could not read army from file");
        }

    }
}


