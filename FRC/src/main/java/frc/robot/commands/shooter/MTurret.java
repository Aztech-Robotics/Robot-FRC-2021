package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.shooter.Turret;

public class MTurret extends CommandBase {
  private Turret s_turret = new Turret();

  public MTurret(Turret subsystem) {
    s_turret = subsystem;
    addRequirements(s_turret);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    Robot.RC.turretM.setSpeed(Robot.RC.Axis1(4));
  }

  @Override
  public void end(boolean interrupted) {
    Robot.RC.turretM.setSpeed(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
