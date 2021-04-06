package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
//import edu.wpi.first.wpilibj.Compressor;

public class Robot extends TimedRobot {
  private Command m_autonomousCommand;

  /** Robot Container */
  public static RobotContainer RC;

  /** Compressor */
  //public Compressor compressor = new Compressor(0);

  /** Pistons */
  //public static Pistons solenoids;

  @Override
  public void robotInit() {
    RC = new RobotContainer();
    RC.angleS.reset();
  }
  
  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();
    double angulo = RC.angleS.ImAngle();
    SmartDashboard.putNumber("Angulo", angulo);
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  @Override
  public void teleopPeriodic() {
    /** Start compressor */
    //compressor.setClosedLoopControl(true);

    /** Move pistons */
    //solenoids.setIntake(RC.control0.getAButton(),RC.control0.getBButton());
  }

  @Override
  public void testInit() {
    CommandScheduler.getInstance().cancelAll();
  }

  @Override
  public void testPeriodic() {}
}
