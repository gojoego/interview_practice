/*

Write a temperature conversion function. The function will take two parameters:
the temp, and the current unit of temp (either 'C' or 'F'). If the current temp is
Fahrenheit, return the temp in Celsius and vice versa.

Try these test cases:
    - convertTemperature(32, "C") -> Should return 89.6 F
    - convertTemperature(32, "F") -> Should return 0 C
    - convertTemperature(20, "C") -> Should return 68 F
    - convertTemperature(98, "F") -> Should return 36.667 C
*/
public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        convertTemp(20, "C");

    }

    public static void convertTemp(double temp, String metricOrNo) {

        if (metricOrNo.equalsIgnoreCase("C")) {
            double fahrenheit = (temp * 1.8) + 32;
            System.out.println(temp + " degrees Celsius = " + fahrenheit + " Fahrenheit" );
        } else {
            double celsius = (temp - 32) / 1.8;
            System.out.println(temp + " degrees Fahrenheit = " + celsius + " Celsius");
        }
    }
}
