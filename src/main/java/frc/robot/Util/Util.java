package frc.robot.Util;

public class Util {
    
    public enum destination
    {
        CONSOLE,
        DASHBOARD
    }
    CalsUtil cals;

    public Util(CalsUtil cals){
        this.cals = cals;
    }

    public void log(int level, String keyName){
        if(level == 0 || level > cals.PRINT_SEVERITY || cals.PRINT_SEVERITY == 0){
            return;
        }else{
            
        }
    }
}
