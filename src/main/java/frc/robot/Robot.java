/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.commands.DumpBackAuton;
import frc.robot.commands.BackUpAuton;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  
	public static Drivetrain drivetrain;
	public static OI oi;
	public DumpBackAuton auton1;
	public BackUpAuton auton2;

	// public DoubleSolenoid shoot1;
	// public DoubleSolenoid shoot2;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		drivetrain = new Drivetrain();		
		oi = new OI();

		// shoot1 = new DoubleSolenoid(2, 3);
		// shoot2 = new DoubleSolenoid(4, 5);

	}

	/**
	 * This function is called every robot packet, no matter the mode. Use
	 * this for items like diagnostics that you want ran during disabled,
	 * autonomous, teleoperated and test.
	 *
	 * <p>This runs after the mode specific periodic functions, but before
	 * LiveWindow and SmartDashboard integrated updating.
	 */
	@Override
	public void robotPeriodic() {
	}

	
	@Override
	public void autonomousInit() {
		auton1.execute(); //uncomment this to run dump back auton
		//auton2.execute(); //uncomment this to run back up auton
		//TODO: ADD SUPPORT FOR A SWITCH TO DECIDE WHICH AUTON TO RUN
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {

	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {

		drivetrain.drive.arcadeDrive(oi.getLeft(), oi.getRight());


	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
