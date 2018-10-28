import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter the gender of the first Human  (Man or Woman)");
        Scanner multyVariable = new Scanner(System.in);
       String  genderFirstOne = multyVariable.next().toLowerCase();
       if(genderFirstOne.equals("man")){
           Man Man1 = new Man();
           Man1.setGender(true);
           System.out.println("\n"+"Enter his name");
           String hisName = multyVariable.next();
           Man1.setName(hisName);
           System.out.println("\n"+"Enter his Last name");
           String lastName = multyVariable.next();
           Man1.setLastname(lastName);
           System.out.println("\n"+"Enter his height in meters (e.g 1.95)" );
           float hisHeight  = multyVariable.nextFloat();
           Man1.setHeight(hisHeight);
           System.out.println("\n"+"Enter his weight in kg (e.g 75.25)" );
           float hisMass = multyVariable.nextFloat();
           Man1.setWeight(hisMass);
           System.out.println("\n"+"Enter the gender of his or her partner (Man or Woman)");
           String secondGender = multyVariable.next().toLowerCase();
           if(secondGender.equals("man")){
               Man Man2 = new Man();
               Man2.setGender(true);
               System.out.println("\n"+"Enter his name");
               String hisName1 = multyVariable.next();
               Man2.setName(hisName1);
               System.out.println("\n"+"Enter his Last name");
               String lastName1 = multyVariable.next();
               Man2.setLastname(lastName1);
               System.out.println("\n"+"Enter his height in meters (e.g 1.95)" );
               float hisHeight1  = multyVariable.nextFloat();
               Man2.setHeight(hisHeight1);
               System.out.println("\n"+"Enter his weight in kg (e.g 75.25)" );
               float hisMass1 = multyVariable.nextFloat();
               Man2.setWeight(hisMass1);
               Man1.makeRalations(Man2);
           }
           if(secondGender.equals("woman")){
               Woman Woman2 = new Woman();
               Woman2.setGender(true);
               System.out.println("\n"+"Enter her name");
               String hisName2 = multyVariable.next();
               Woman2.setName(hisName2);
               System.out.println("\n"+"Enter her Last name");
               String lastName2 = multyVariable.next();
               Woman2.setLastname(lastName2);
               System.out.println("\n"+"Enter her height in meters (e.g 1.65)" );
               float hisHeight2  = multyVariable.nextFloat();
               Woman2.setHeight(hisHeight2);
               System.out.println("\n"+"Enter her weight in kg (e.g 61.25)" );
               float hisMass2 = multyVariable.nextFloat();
               Woman2.setWeight(hisMass2);
               Man1.makeRalations(Woman2);
           }
       }
        if(genderFirstOne.equals("woman")){
            Woman Woman1 = new Woman();
            Woman1.setGender(true);
            System.out.println("\n"+"Enter her name");
            String hisName = multyVariable.next();
            Woman1.setName(hisName);
            System.out.println("\n"+"Enter her Last name");
            String lastName = multyVariable.next();
            Woman1.setLastname(lastName);
            System.out.println("\n"+"Enter her height in meters (e.g 1.65)" );
            float hisHeight  = multyVariable.nextFloat();
            Woman1.setHeight(hisHeight);
            System.out.println("\n"+"Enter her weight in kg (e.g 61.25)" );
            float hisMass = multyVariable.nextFloat();
            Woman1.setWeight(hisMass);
            System.out.println("\n"+"Enter the gender of his or her partner (Man or Woman)");
            String secondGender = multyVariable.next().toLowerCase();
            if(secondGender.equals("man")){
                Man Man2 = new Man();
                Man2.setGender(true);
                System.out.println("\n"+"Enter his name");
                String hisName1 = multyVariable.next();
                Man2.setName(hisName1);
                System.out.println("\n"+"Enter his Last name");
                String lastName1 = multyVariable.next();
                Man2.setLastname(lastName1);
                System.out.println("\n"+"Enter his height in meters (e.g 1.95)" );
                float hisHeight1  = multyVariable.nextFloat();
                Man2.setHeight(hisHeight1);
                System.out.println("\n"+"Enter his weight in kg (e.g 75.25)" );
                float hisMass1 = multyVariable.nextFloat();
                Man2.setWeight(hisMass1);
                Woman1.makeRalations(Man2);
            }
            if(secondGender.equals("woman")){
                Woman Woman2 = new Woman();
                Woman2.setGender(true);
                System.out.println("\n"+"Enter her name");
                String hisName2 = multyVariable.next();
                Woman2.setName(hisName2);
                System.out.println("\n"+"Enter her Last name");
                String lastName2 = multyVariable.next();
                Woman2.setLastname(lastName2);
                System.out.println("\n"+"Enter her height in meters (e.g 1.65)" );
                float hisHeight2  = multyVariable.nextFloat();
                Woman2.setHeight(hisHeight2);
                System.out.println("\n"+"Enter her weight in kg (e.g 61.25)" );
                float hisMass2 = multyVariable.nextFloat();
                Woman2.setWeight(hisMass2);
                Woman1.makeRalations(Woman2);
            }
        }





    }

}
