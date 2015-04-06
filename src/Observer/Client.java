package Observer;

/**
 * Created by Ethan and Jeel on 4/5/2015.
 */
public class Client {

    public static void main(String []args){

        StreetLight streetLight = new StreetLight();
        StreetLight streetLight2 = new StreetLight();

        Cars car1 = new Cars(streetLight);
        Cars car2 = new Cars(streetLight2);

        streetLight.setLightColor("red");
        car1.printLightColor();

        streetLight2.setLightColor("green");
        car2.printLightColor();



    }
}
