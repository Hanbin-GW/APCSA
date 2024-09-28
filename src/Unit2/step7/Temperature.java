package Unit2.step7;

public class Temperature {
    private double temperature;
    public static double maxTemp = 0;

    public Temperature(double temperature) {
        this.temperature = temperature;
        if(temperature > maxTemp)
        {
            maxTemp = temperature;
        }
    }
    public static void printMax()
    {
        System.out.println(maxTemp);
    }
    public static void main(String[]args)
    {
        Temperature temp = new Temperature(75);
        Temperature temp2 = new Temperature(100);
        Temperature.printMax();
    }
}
