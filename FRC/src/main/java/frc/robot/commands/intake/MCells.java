package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.intake.Cells;

public class MCells extends CommandBase {
  private Cells s_cells = new Cells();

  public MCells(Cells subsystem) {
    s_cells = subsystem;
    addRequirements(s_cells);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    Robot.RC.cellsM.setSpeed(Robot.RC.Axis1(3)-Robot.RC.Axis1(2));
  }

  @Override
  public void end(boolean interrupted) {
    Robot.RC.cellsM.setSpeed(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
