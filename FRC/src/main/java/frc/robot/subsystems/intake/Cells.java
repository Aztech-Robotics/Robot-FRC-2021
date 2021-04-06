package frc.robot.subsystems.intake;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Cells extends SubsystemBase {
  private final CANSparkMax m_cells = new CANSparkMax(Constants.cellsm,MotorType.kBrushless);

  public Cells() {}
  
  @Override
  public void periodic() {
  }

  public void setSpeed(double speed){
    m_cells.set(speed*.5);
  }
}
