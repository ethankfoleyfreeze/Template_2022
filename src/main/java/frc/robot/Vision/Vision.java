package frc.robot.Vision;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;

public abstract class Vision {

    CalsVision cals;

    NetworkTable piTable;
    NetworkTable visionTable;

    public Vision(CalsVision cals, double tableUpdateRate){
        this.cals = cals;
        NetworkTableInstance.getDefault().setUpdateRate(tableUpdateRate);
        visionTable = NetworkTableInstance.getDefault().getTable("Vision");
        piTable = NetworkTableInstance.getDefault().getTable("Pi");
    }

    public abstract boolean hasImage1();
    public abstract boolean hasImage2();

    public abstract void addNTListenerImage1(String entry);
    public abstract void addNTListenerImage2(String entry);

    public abstract void enableNTImage1(boolean set);
    public abstract void enableNTImage2(boolean set);
}
