package frc.robot.HAL;

interface Motor {
    public void setPower(double power);
    public void setPosition(double revs);
    public double getPosition();
    public void setSpeed(double rpm);
    public double getSpeed();
    public double getCurrent();
    public double getTemp();
    public boolean isJammed();
    public boolean getBrake();
    public void setBrake(boolean brake);
}
