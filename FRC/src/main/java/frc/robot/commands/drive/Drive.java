package frc.robot.commands.drive;

import frc.robot.Robot;
import frc.robot.subsystems.drive.DriveTrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Drive extends CommandBase {
  private DriveTrain s_drive = new DriveTrain();

  
  public Drive(DriveTrain subsystem) {
    s_drive = subsystem;
    addRequirements(s_drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Robot.RC.driveT.drive(Robot.RC.Axis0(0),Robot.RC.Axis0(1));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Robot.RC.driveT.drive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
