// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANEncoder;
public class DriveTrain extends SubsystemBase {
  private final CANSparkMax m_left = new CANSparkMax(Constants.left_ID, MotorType.kBrushless);
  private final CANSparkMax m_right = new CANSparkMax(Constants.right_ID, MotorType.kBrushless);
  private final CANEncoder e_right = m_right.getEncoder();
  private final CANEncoder e_left = m_left.getEncoder();
  public DriveTrain() {
    m_left.setInverted(true);

    m_left.setIdleMode(IdleMode.kBrake);
    m_right.setIdleMode(IdleMode.kBrake);
  }

  @Override
  public void periodic() {
  }

  @Override
  public void simulationPeriodic() {
  }
public double encleft(){
return e_left.getPosition();
}
public double encright(){
  return e_right.getPosition();
}
  public void drive(final double y, final double x){
    if (x < .2 && x > -.2 && y < .2 && y > -.2) {
      m_left.set(0);
      m_right.set(0);
    } else {
      m_left.set((-y - x)*.5);
      m_right.set((y - x)*.5);
    }
  }
}
