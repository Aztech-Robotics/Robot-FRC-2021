// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.shooter;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Angle extends SubsystemBase {
  private final TalonSRX m_angle = new TalonSRX(Constants.anglem);
  
  public Angle() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

public double ImAngle (){
    return m_angle.getSelectedSensorPosition();
}

public void reset (){
  m_angle.setSelectedSensorPosition(0);
}

  public void setSpeed(double speed){
    m_angle.set(ControlMode.PercentOutput, (speed*.5));
  }

  public void zone1(double speed){
    if(m_angle.getSelectedSensorPosition() > -45555){
      m_angle.set(ControlMode.PercentOutput, speed);
    }
    else{
      m_angle.set(ControlMode.PercentOutput, 0);
    }
  }



    public void zone2(double speed){
      if(m_angle.getSelectedSensorPosition() > -81444){
        m_angle.set(ControlMode.PercentOutput, speed);
      }
      else{
        m_angle.set(ControlMode.PercentOutput, 0);
      }
    }



    public void zone3(double speed){
        if(m_angle.getSelectedSensorPosition() > -47300){
          m_angle.set(ControlMode.PercentOutput, speed);
        }
        else{
          m_angle.set(ControlMode.PercentOutput, 0);
        }
      }



    public void zone4(double speed){
          if(m_angle.getSelectedSensorPosition() > -105990){
            m_angle.set(ControlMode.PercentOutput, speed);
          }
          else{
            m_angle.set(ControlMode.PercentOutput, 0);
          }
  }
}
