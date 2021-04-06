package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.shooter.Shooter;

public class Shoot extends CommandBase {
  private Shooter s_shooter = new Shooter();

  public Shoot(Shooter subsystem) {
    s_shooter = subsystem;
    addRequirements(s_shooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Robot.RC.shooterS.setSpeed(-Robot.RC.Axis0(3));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Robot.RC.shooterS.setSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
