// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;


// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private Spark frontLeftController;
private Spark rearLeftController;
private MotorControllerGroup leftGroup;
private Spark frontRightController;
private Spark rearRightController;
private MotorControllerGroup rightGroup;
private DifferentialDrive robotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public DriveTrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
frontLeftController = new Spark(Constants.DriveConstants.kLeftMotor1Port);
 addChild("FrontLeftController",frontLeftController);
 frontLeftController.setInverted(false);

rearLeftController = new Spark(Constants.DriveConstants.kLeftMotor2Port);
 addChild("RearLeftController",rearLeftController);
 rearLeftController.setInverted(false);

leftGroup = new MotorControllerGroup(frontLeftController, rearLeftController  );
 addChild("LeftGroup",leftGroup); 

frontRightController = new Spark(Constants.DriveConstants.kRightMotor1Port);
 addChild("FrontRightController",frontRightController);
 frontRightController.setInverted(false);

rearRightController = new Spark(Constants.DriveConstants.kRightMotor2Port);
 addChild("RearRightController",rearRightController);
 rearRightController.setInverted(false);

rightGroup = new MotorControllerGroup(frontRightController, rearRightController  );
 addChild("RightGroup",rightGroup);
 

robotDrive = new DifferentialDrive(leftGroup, rightGroup);
 addChild("Robot Drive",robotDrive);
 robotDrive.setSafetyEnabled(true);
robotDrive.setExpiration(0.1);
robotDrive.setMaxOutput(1.0);



    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void drive(double left, double right) {
        robotDrive.tankDrive(left, right);
    }

}

