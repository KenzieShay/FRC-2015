package org.usfirst.frc.team4993.Molly;

import org.usfirst.frc.team4993.Molly.commands.AutoDrive;
import org.usfirst.frc.team4993.Molly.commands.AutoLift;
import org.usfirst.frc.team4993.Molly.commands.AutonomousMode;
import org.usfirst.frc.team4993.Molly.commands.Drive;
import org.usfirst.frc.team4993.Molly.commands.Lift;
import org.usfirst.frc.team4993.Molly.commands.SetDown;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	 public JoystickButton joystickButton1;
	    public static Joystick joystick1;
	    public JoystickButton joystickButton2;
	    public static Joystick joystick2;

	    public OI() {
	        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

	        joystick2 = new Joystick(1);
	        
	        joystickButton2 = new JoystickButton(joystick2, 1);
	        joystickButton2.whileHeld(new SetDown());
	        
	        joystick1 = new Joystick(0);
	        
	        joystickButton1 = new JoystickButton(joystick1, 1);
	        joystickButton1.whileHeld(new Lift());

		    
	        // SmartDashboard Buttons
	        SmartDashboard.putData("Autonomous", new AutonomousMode());

	        SmartDashboard.putData("Lift", new Lift());

	        SmartDashboard.putData("SetDown", new SetDown());

	        SmartDashboard.putData("Drive", new Drive());

	        SmartDashboard.putData("AutoLift", new AutoLift());

	        SmartDashboard.putData("AutoDrive", new AutoDrive());


	    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
	    }
	    
	    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
	    public static Joystick getJoystick1() {
	        return joystick1;
	    }

	    public static Joystick getJoystick2() {
	        return joystick2;
	    }


	    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
	}