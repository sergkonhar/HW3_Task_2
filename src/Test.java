public class Test {
    public static void main(String[] args) {
        Man nick = new Man();
    nick.setGender(true);

   Man denny = new Man();
   denny.setGender(true);
        System.out.println(nick.isGender()+"  "+denny.isGender());
        System.out.println(nick.speak(denny));
        System.out.println(denny.endure(nick));
  Woman baba = new Woman();
  baba.setGender(false);
       Human a =  baba.giveBirthTo(nick);
       a.setHeight(10);
        System.out.println(a.toString());
        baba.makeARelations(nick);
    }

}
