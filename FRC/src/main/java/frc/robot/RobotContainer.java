// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.commands.drive.Drive;
import frc.robot.commands.intake.MCells;
import frc.robot.commands.intake.MIntake;
import frc.robot.commands.shooter.MAngle;
import frc.robot.commands.shooter.MTurret;
import frc.robot.commands.shooter.Shoot;
import frc.robot.commands.shooter.Zona1;
import frc.robot.commands.shooter.Zona2;
import frc.robot.commands.shooter.Zona3;
import frc.robot.commands.shooter.Zona4;
import frc.robot.subsystems.drive.DriveTrain;
import frc.robot.subsystems.intake.Cells;
import frc.robot.subsystems.intake.Intake;
import frc.robot.subsystems.shooter.Angle;
import frc.robot.subsystems.shooter.Shooter;
import frc.robot.subsystems.shooter.Turret;


public class RobotContainer {
  /** Drive train */
  public DriveTrain driveT = new DriveTrain();      //Subsystem
  public Drive r_drive = new Drive(driveT);         //Command

  /** Intake */
  public Cells cellsM = new Cells();                //Subsystem
  private MCells c_cells = new MCells(cellsM);      //Command
  public Intake intakeS = new Intake();             //Subsystem
  private MIntake c_intake = new MIntake(intakeS);  //Command

  /** Shooter */
  public Shooter shooterS = new Shooter();          //Subsystem Shooter
  public Shoot c_shoot = new Shoot(shooterS);       //Command Shooter
  public Turret turretM = new Turret();             //Subsystem Turret  
  public MTurret c_turret = new MTurret(turretM);   //Command Turret
  public Angle angleS = new Angle();                //Subsystem Angle
  public MAngle c_angle = new MAngle(angleS);       //Command Angle

  public Zona1 c_zone1 = new Zona1(angleS);
  public Zona2 c_zone2 = new Zona2(angleS);
  public Zona3 c_zone3 = new Zona3(angleS);
  public Zona4 c_zone4 = new Zona4(angleS);
  /** Control 0 */
  public XboxController control0 = new XboxController(0);

  /** Control 1 */
  public XboxController control1 = new XboxController(1);
  //Buttons
  public JoystickButton abutton = new JoystickButton(control1, 1);
  public JoystickButton bbutton = new JoystickButton(control1, 2);
  public JoystickButton cbutton = new JoystickButton(control1, 3);
  public JoystickButton dbutton = new JoystickButton(control1, 4);


  /** Axis methods */
  public double Axis0(final int axis){              //Control 1
    return control0.getRawAxis(axis);
  }
  public double Axis1(final int axis){              //Control 2
    return control1.getRawAxis(axis);
  }

  /** Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    configureButtonBindings();
    driveT.setDefaultCommand(r_drive);
    cellsM.setDefaultCommand(c_cells);
    shooterS.setDefaultCommand(c_shoot);
    turretM.setDefaultCommand(c_turret);
    angleS.setDefaultCommand(c_angle);
    intakeS.setDefaultCommand(c_intake);
    
    
    abutton.whenPressed(new Zona1());
    bbutton.whenPressed(c_zone2);
    cbutton.whenPressed(c_zone3);
    dbutton.whenPressed(c_zone4);
  }

  private void configureButtonBindings() {}

 
  /**public Command getAutonomousCommand() {
  }*/
}
