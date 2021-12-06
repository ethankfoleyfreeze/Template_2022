package frc.robot.Util;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Util {

    public Util(CalsUtil cals){
        
    }

    public static void logBool(int level, boolean smartDashboard, boolean console, String keyName, boolean value){
        if(level == 0 || level > CalsUtil.PRINT_SEVERITY || CalsUtil.PRINT_SEVERITY == 0){
            return;
        }else{
            if(smartDashboard){
                SmartDashboard.putBoolean(keyName, value);
            }
            if(console){
                System.out.println(keyName + ":  " + value);
            }
        }
    }

    public static void logDouble(int level, boolean smartDashboard, boolean console, String keyName, double value){
        if(level == 0 || level > CalsUtil.PRINT_SEVERITY || CalsUtil.PRINT_SEVERITY == 0){
            return;
        }else{
            if(smartDashboard){
                SmartDashboard.putNumber(keyName, value);
            }
            if(console){
                System.out.println(keyName + ":  " + value);
            }
        }
    }

    public static void logString(int level, boolean smartDashboard, boolean console, String keyName, String value){
        if(level == 0 || level > CalsUtil.PRINT_SEVERITY || CalsUtil.PRINT_SEVERITY == 0){
            return;
        }else{
            if(smartDashboard){
                SmartDashboard.putString(keyName, value);
            }
            if(console){
                System.out.println(keyName + ":  " + value);
            }
        }
    }
}
