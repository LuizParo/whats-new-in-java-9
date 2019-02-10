package academy.learnprogramming.interfaces;


import java.util.Date;

/**
 * Created by Frank J. Mitropoulos.
 *
 * This interface represents the interface to an RemoteControllable
 * API that can be used to provide remote control to devices that implement it.
 *
 */
public interface RemoteControllable {

    static String systemStatus = "OK";

    String deviceDescription();
    void turnOn();
    void turnOff();
    void reset();
    void notifyUser();

    default String getStatus() {
        return buildStatus();
    }

    default String getDetailedStatus() {
        return buildStatus() +  "--" + systemStatus;
    }

    private String buildStatus() {
        return deviceDescription() + "--" + new Date();
    }

    static String getSystemStatus() {
        return systemStatus;
    }



}
