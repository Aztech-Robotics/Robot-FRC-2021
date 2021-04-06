// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.shooter;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Turret extends SubsystemBase {
  private final TalonFX m_turret = new TalonFX(Constants.turretm);

  public Turret() {}

  @Override
  public void periodic() {}

  public void setSpeed(double speed){
    m_turret.set(ControlMode.PercentOutput, (speed*.35));
  }
}
