public class Man extends Human{

    @Override
    public void setGender(boolean gender) {
        if(gender) {
            super.setGender(gender);
        }

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
    if(speak&endure&time){
        if(!partner.isGender()){
           return  ((Woman)partner).giveBirthTo(this);
        }
    if(partner.isGender()){
        return null;
    }

    }
    else System.out.println("\n"+"No relations");
    return null;
    }
}
