package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.shooter.Angle;

public class MAngle extends CommandBase {
  private Angle s_angle = new Angle();
  public MAngle(Angle subsystem) {
    s_angle = subsystem;
    addRequirements(s_angle);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  
  @Override
  public void execute() {
    Robot.RC.angleS.setSpeed(-Robot.RC.Axis1(1));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
