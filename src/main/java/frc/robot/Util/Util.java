package frc.robot.Util;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Util {

    public static enum LOG_GROUPS {
        DRIVE, INPUTS, INTAKE, SCORING, TRANSPORT, VISION
    }
    private static int[] LOG_VALUES = {0, 4, 0, 0, 0, 0};

    public Util(){
        
    }

    public static void logBool(LOG_GROUPS group, int level, boolean smartDashboard, boolean console, String keyName, boolean value){

        int enumPos = group.ordinal();//finds at what position "group" is found in the LOG_GROUPS enum

        if(level <= LOG_VALUES[enumPos]){
            if(smartDashboard){
                SmartDashboard.putBoolean(keyName, value);
            }
            if(console){
                System.out.println(keyName + ":  " + value);
            }
        }
    }

    public static void logDouble(LOG_GROUPS group, int level, boolean smartDashboard, boolean console, String keyName, double value){

        int enumPos = group.ordinal();//finds at what position "group" is found in the LOG_GROUPS enum

        if(level <= LOG_VALUES[enumPos]){
            if(smartDashboard){
                SmartDashboard.putNumber(keyName, value);
            }
            if(console){
                System.out.println(keyName + ":  " + value);
            }
        }
    }

    public static void logString(LOG_GROUPS group, int level, boolean smartDashboard, boolean console, String keyName, String value){

        int enumPos = group.ordinal();//finds at what position "group" is found in the LOG_GROUPS enum

        if(level <= LOG_VALUES[enumPos]){
            if(smartDashboard){
                SmartDashboard.putString(keyName, value);
            }
            if(console){
                System.out.println(keyName + ":  " + value);
            }
        }
    }
}
