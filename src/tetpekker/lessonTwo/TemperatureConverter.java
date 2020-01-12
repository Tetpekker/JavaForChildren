package tetpekker.lessonTwo;

public class TemperatureConverter {

    public static void main(String[] args){

        System.out.println(convertTemp(45, 'C'));
    }

    public static String convertTemp(int temperature, char convertTo){


        String newTemperature;
        if(convertTo == 'F'){
            newTemperature = "This temperature is a " + temperature + " of Farengeight";
        } else {
            newTemperature = "This temperature is a " + temperature + " of Celsium";
        }
        return newTemperature;
    }

    ReportCard rc = new ReportCard();

}
