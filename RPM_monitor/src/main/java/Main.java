
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        //code to test if the generator works
        VitalSignsGenerator signGenerator = new  VitalSignsGenerator();
        System.out.println("Heart Rate: " + signGenerator.generateHeartRate() + " bpm");
        System.out.println("Blood Pressure: " + signGenerator.generateBloodPressure());
        System.out.println("ECG: " + signGenerator.generateECG() + " mV");
        System.out.println("Respiratory Rate: " + signGenerator.generateRespiratoryRate() + " breaths/min");
        System.out.println("Body Temperature: " + signGenerator.generateBodyTemperature() + " °C");

    }




}
