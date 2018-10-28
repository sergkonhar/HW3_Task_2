import java.util.Random;
import java.util.Scanner;

public class Woman extends Human {
    @Override
    public void setGender(boolean gender) {
        if(!gender) {
            super.setGender(gender);
        }
        }



Human giveBirthTo(Human partner){
        Random genderRandomer = new Random();
        int gender = genderRandomer.nextInt(100)+1;
        if(gender>50){
            Man newMan = new Man();
       newMan.setGender(true);
        Scanner hisName = new Scanner(System.in);
            System.out.println("\n"+"You got a boy, enter his name"+"\n");
        String nameOf = hisName.next();
        newMan.setName(nameOf);
        newMan.setHeight((float) ((partner.getHeight()+(getHeight()*0.1))-getHeight()));
        newMan.setWeight((float) ((partner.getWeight()+(getWeight()*0.1))-getWeight()));
        newMan.setLastname(partner.getLastname());
            System.out.println("\n"+"Parameters of new Man");
            System.out.println(newMan.toString());
        return newMan;
        }
    if(gender<=50){
        Woman newWoman = new Woman();
        newWoman.setGender(false);
        Scanner herName = new Scanner(System.in);
        System.out.println("\n"+"You got a girl, enter her name"+"\n");
        String nameOf = herName.next();
        newWoman.setName(nameOf);
        newWoman.setHeight((float) ((getHeight()+(partner.getHeight()*0.1))-getHeight()));
        newWoman.setWeight((float) ((getWeight()+(partner.getWeight()*0.1))-getWeight()));
        newWoman.setLastname(partner.getLastname());
        System.out.println("\n"+"Parameters of new Woman");
        System.out.println(newWoman.toString());
        return newWoman;
    }

        return null;
    }

    @Override
    Human makeRalations(Human partner) {
        boolean speak = speak(partner);
        if(speak){
            System.out.println("\n"+"they can speak with each other");
        }
       else System.out.println("\n"+"they can't speak with each other");

        boolean endure = endure(partner);
       if(endure){
           System.out.println("\n"+"they can endure each other");
       }
       else System.out.println("\n"+"they can't endure each other");

       boolean time =  spendtimeTogather(partner);
       if(time){
           System.out.println("\n"+"they can spend time together");
       }
    else System.out.println("\n"+"they can't spend time together");

    if(speak&time&endure){
       if(partner.isGender()) {

       return giveBirthTo(partner);
       }
        if(!partner.isGender()) {
            return null;
        }
    }
    else System.out.println("\n"+"No relations");

    return null;
    }
}

