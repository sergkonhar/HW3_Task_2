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
        if(partner.isGender()){
            Human baby = new Human();
            Scanner set = new Scanner(System.in);
           String  nameB = set.next();
           baby.setName(nameB);
            return baby;

        }
return null;
    }

    @Override
    Human additionalMethod(Human partner) {
        Human baby = new Human();
        Random genderRandomer = new Random();
        int genderFor = genderRandomer.nextInt(100)+1;
        if(genderFor>=50){
            Man newMan = new Man();
            newMan.setGender(true);
            Scanner parameters1 = new Scanner(System.in);
            System.out.println("\n"+"Your baby is a boy"+"\n"+ "Enter his name");
        String name1 = parameters1.next();
        newMan.setName(name1);
        newMan.setLastname(partner.getLastname());
        newMan.setHeight((float) ((partner.getHeight()+(getHeight()*0.1)))-getHeight());
        newMan.setWeight((float) ((partner.getWeight()+(getWeight() * 0.1 )))-getWeight());

        }
        if(genderFor<50){
            Woman newWoman = new Woman();
        newWoman.setGender(false);
            Scanner parameters = new Scanner(System.in);
            System.out.println("\n"+"Your baby is a girl+" +"\n" + "Enter her name" );
            String name = parameters.next();
            newWoman.setName(name);
        newWoman.setLastname(partner.getLastname());
        }
        return baby;
    }
}
