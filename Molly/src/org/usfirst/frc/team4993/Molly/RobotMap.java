package org.usfirst.frc.team4993.Molly;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	 // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainSpeedController1;
    public static SpeedController driveTrainSpeedController2;
    public static SpeedController driveTrainSpeedController3;
    public static SpeedController driveTrainSpeedController4;
    public static RobotDrive driveTrainRobotDrive4;
    public static Solenoid armsSolenoid1;
    public static Solenoid armsSolenoid2;
    public static Solenoid armsSolenoid3;
    public static Solenoid armsSolenoid4;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainSpeedController1 = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 1", (Talon) driveTrainSpeedController1);
        
        driveTrainSpeedController2 = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 2", (Talon) driveTrainSpeedController2);
        
        driveTrainSpeedController3 = new Talon(2);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 3", (Talon) driveTrainSpeedController3);
        
        driveTrainSpeedController4 = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 4", (Talon) driveTrainSpeedController4);
        
        driveTrainRobotDrive4 = new RobotDrive(driveTrainSpeedController1, driveTrainSpeedController2, driveTrainSpeedController3, driveTrainSpeedController4);
        
        driveTrainRobotDrive4.setSafetyEnabled(true);
        driveTrainRobotDrive4.setExpiration(0.1);
        driveTrainRobotDrive4.setSensitivity(0.5);
        driveTrainRobotDrive4.setMaxOutput(1.0);
        

        armsSolenoid1 = new Solenoid(0, 0);
        LiveWindow.addActuator("Arms", "Solenoid 1", armsSolenoid1);
        
        armsSolenoid2 = new Solenoid(0, 1);
        LiveWindow.addActuator("Arms", "Solenoid 2", armsSolenoid2);
        
        armsSolenoid3 = new Solenoid(0, 2);
        LiveWindow.addActuator("Arms", "Solenoid 3", armsSolenoid3);
        
        armsSolenoid4 = new Solenoid(0, 3);
        LiveWindow.addActuator("Arms", "Solenoid 4", armsSolenoid4);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
