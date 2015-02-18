// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team4993.Molly.subsystems;

import org.usfirst.frc.team4993.Molly.OI;
import org.usfirst.frc.team4993.Molly.Robot;
import org.usfirst.frc.team4993.Molly.RobotMap;
import org.usfirst.frc.team4993.Molly.commands.Drive;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
    
    SpeedController speedController1 = RobotMap.driveTrainSpeedController1;
    SpeedController speedController2 = RobotMap.driveTrainSpeedController2;
    SpeedController speedController3 = RobotMap.driveTrainSpeedController3;
    SpeedController speedController4 = RobotMap.driveTrainSpeedController4;
    static RobotDrive robotDrive4 = RobotMap.driveTrainRobotDrive4;
   
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Drive());
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void takeJoystickInputs(Joystick right, Joystick left){
    	robotDrive4.tankDrive(left, right);
    }
    public static void stop(){
    	robotDrive4.drive(0, 0);
    }
    
    public static void AuDrive(){
    	robotDrive4.setSafetyEnabled(false);
    	Timer.delay(5.0);
    	robotDrive4.drive(-0.7, 0);
    	Timer.delay(5.0);
    	robotDrive4.drive(0, 0);
    	
    }

}


