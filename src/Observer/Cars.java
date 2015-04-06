package Observer;

/**
 * Created by Ethan and Jeel on 4/5/2015.
 */
public class Cars implements Observer {

    private String lightColor;
    private Subject streetLight;
    private int carNumber;
    private static int carNumberTracker = 0;

    public Cars(Subject streetLight){

        this.streetLight = streetLight;
        this.carNumber = ++carNumberTracker;
        System.out.println("New street light observer: Car #" + this.carNumber);

        streetLight.addObserver(this);
    }


    @Override
    public void update(String lightColor) {

        this.lightColor = lightColor;
    }

    public void printLightColor(){
        System.out.println("Car number " + carNumber + " sees a " + lightColor + " light.");
    }
}
