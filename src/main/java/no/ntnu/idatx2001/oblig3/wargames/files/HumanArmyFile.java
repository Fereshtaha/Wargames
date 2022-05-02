package no.ntnu.idatx2001.oblig3.wargames.files;

import no.ntnu.idatx2001.oblig3.wargames.*;

import java.io.*;

public class HumanArmyFile {
    public static void main(String[] args) {
        String comma = ", ";
        String header = "Human Army";

        /*
        * Skriver armeen inn i tekstfila
         */
        try {
            Army humanArmy = new Army("Human army");
            Army orchidsHorde = new Army("Orchich horde");
            BufferedWriter writer = new BufferedWriter(new FileWriter("human-army.csv"));
            writer.write(header);

            //for (int i = 1; i<=10; i++) {
                humanArmy.add(new InfantryUnit("Legionnare", 100));
                humanArmy.add(new CavalryUnit("Swordman", 100));
                humanArmy.add(new RangedUnit("Serviceman", 100));
                humanArmy.add(new CommanderUnit("Archer", 180));

                orchidsHorde.add(new InfantryUnit("Legionnare", 100));
                orchidsHorde.add(new CavalryUnit("Swordman", 100));
                orchidsHorde.add(new RangedUnit("Serviceman", 100));
                orchidsHorde.add(new CommanderUnit("Archer", 180));

            //}
           for (Unit a : humanArmy.getAllUnits()) {
               writer.newLine();
               for (Unit b : humanArmy.getRangedUnits()) {
                   writer.write("RangedUnit" + comma + b.getName("Swordman") + comma + b.getHealth());
               }
               writer.newLine();
               for (Unit c : humanArmy.getCommanderUnits()) {
                   writer.write("CommanderUnit" + comma + c.getName("Archer") + comma + c.getHealth());
               }
               writer.newLine();
               for (Unit d : humanArmy.getCavalryUnits()) {
                   writer.write("CavalryUnit" + comma + d.getName("Swordman") + comma + d.getHealth());
               }
               writer.newLine();
               for (Unit e : humanArmy.getInfantryUnits()) {
                   writer.write("InfantryUnit" + comma + e.getName("Legionnare" + comma + e.getHealth()));
               }
               // writer.append(a.toString());
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*
         * Leser armeen fra fila og printer i konsollen
         */
        try {
            BufferedReader reader = new BufferedReader(new FileReader("filename.csv"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


