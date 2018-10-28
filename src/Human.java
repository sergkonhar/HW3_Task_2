import java.util.Random;

public class Human {
    boolean gender;
    String name;
    String lastname;
    float height;
    float weight;

    public Human() {
    }

    public Human(boolean gender, String name, String lastname, float height, float weight) {
        this.gender = gender;
        this.name = name;
        this.lastname = lastname;
        this.height = height;
        this.weight = weight;
    }



    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    boolean speak(Human partner) {
        if (isGender() & partner.isGender()) {
            Random propabilityStart = new Random();
            int propability = propabilityStart.nextInt(100) + 1;
            if (propability <= 50) {
                return true;
            } else return false;
        } else if (!isGender() & partner.isGender()) {
            return true;
        } else if (isGender() & !partner.isGender()) {
            return true;
        } else if (!isGender() & !partner.isGender()) {
            return true;
        }
        return false;
    }

    boolean endure(Human partner) {
        if (!isGender() & !partner.isGender()) {
            double coefficient = Math.random() + 0.0000000000000001;
            if (coefficient <= 0.05) {
                return true;
            }

        } else if (isGender() & !partner.isGender()) {
            double coefficient = Math.random() + 0.0000000000000001;
            if (coefficient <= 0.7) {
                return true;
            }
        } else if (!isGender() & partner.isGender()) {
            double coefficient = Math.random() + 0.0000000000000001;
            if (coefficient <= 0.7) {
                return true;
            }
        } else if (isGender() & partner.isGender()) {
            double coefficient = Math.random() + 0.0000000000000001;
            if (coefficient <= 0.056) {
                return true;
            }
        }
        return false;


    }

    boolean spendtimeTogather(Human partner) {
        if (getHeight() > partner.getHeight()) {
            float coefficient = (100 - ((partner.getHeight() / getHeight()) * 100));
            if (coefficient > 10) {
                double propability = Math.random() + 0.0000000000000001;
                if (propability <= 0.85) {
                    return true;
                }
                if (coefficient <= 10) {
                    double propability1 = Math.random() + 0.0000000000000001;
                    if (propability1 <= 0.95) {
                        return true;
                    }
                }
            }

        }

        if (getHeight() < partner.getHeight()) {
            float coefficient = (100 - ((getHeight()/partner.getHeight()) * 100));
            if (coefficient > 10) {
                double propability = Math.random() + 0.0000000000000001;
                if (propability <= 0.85) {
                    return true;
                }
                if (coefficient <= 10) {
                    double propability1 = Math.random() + 0.0000000000000001;
                    if (propability1 <= 0.95) {
                        return true;
                    }
                }
            }

        }

        return Boolean.parseBoolean(null);
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }


  Human additionalMethod(Human partner){

        return new Human();
  }

}