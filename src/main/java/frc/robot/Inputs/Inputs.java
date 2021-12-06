package frc.robot.Inputs;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Inputs extends SubsystemBase{

    CalsInputs cals;

    public boolean hasFlySky;
    public boolean hasGamePad;

    public Joystick joystick;

    double time;

    public Inputs(CalsInputs cals){
        this.cals = cals;

        joystick = new Joystick(0);
    }

    /**
     * Every cals.JOYSTICK_CHECK_INTERVAL time period, looks to see if some of the 
     * joystick name is "FlySky" and sets public boolean variables accordingly
     */
    public void periodic(){
        //joystick detection
        
        String name = "none";

        if(Timer.getFPGATimestamp() > time){
            if(joystick.isConnected()){
                name = joystick.getName();
                if(name.contains("FlySky")){
                    hasFlySky = true;
                }else{
                    hasGamePad = true;
                }
            }else{
                hasFlySky = false;
                hasGamePad = false;
            }

            if(cals.DEBUG){
                System.out.println("Joystick Name: " + name + "   Has FlySky: " + hasFlySky + "   Has Game Pad: " + hasGamePad);
            }

            time = Timer.getFPGATimestamp() + cals.JOYSTICK_CHECK_INTERVAL;
        }
    }
}
