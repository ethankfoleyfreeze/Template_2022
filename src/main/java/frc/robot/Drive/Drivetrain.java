package frc.robot.Drive;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase{
    
    CalsDrive cals;

    public Drivetrain(CalsDrive cals){
        this.cals = cals;
    }
}
