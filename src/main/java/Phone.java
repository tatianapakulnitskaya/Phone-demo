public class Phone {
    public int number;
    public String model;
    public double weight;

    /*  public Phone(int number, String model, double weight) {
          this.number = number;
          this.model = model;
          this.weight = weight;
      }*/
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone() {

    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }


    public static void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public static int getNumber(int number) {
        return number;
    }

    public static void receiveCall2(String name, int number) {
        System.out.println("Звонит " + name + " " + number);
    }
}
