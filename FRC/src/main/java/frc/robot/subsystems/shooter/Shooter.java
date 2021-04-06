package frc.robot.subsystems.shooter;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
  private final CANSparkMax m_shooter1 = new CANSparkMax(Constants.shooter1,MotorType.kBrushless);
  private final CANSparkMax m_shooter2 = new  CANSparkMax(Constants.shooter2,MotorType.kBrushless);
  
  public Shooter() {
    m_shooter2.setInverted(true);
  }

  @Override
  public void periodic() {
    
  }

  public void setSpeed(double speed){
    m_shooter1.set(speed);
    m_shooter2.set(speed);
  }
}
