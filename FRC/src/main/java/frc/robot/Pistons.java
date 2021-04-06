package frc.robot;

import edu.wpi.first.wpilibj.Solenoid;

public class Pistons {
    private Solenoid p_intake = new Solenoid(1);

    public Pistons(){}

    public void setIntake(boolean a, boolean b){
        if(a){
            p_intake.set(true);
        }
        if(b){
            p_intake.set(false);
        }
    }
}
