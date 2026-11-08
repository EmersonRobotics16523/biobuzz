package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.util.ElapsedTime;


import com.qualcomm.robotcore.hardware.DcMotorEx;


import java.util.List;
import java.util.concurrent.TimeUnit;


@Autonomous(name = "16523_bio_buzz v1.4", group = "Linear OpMode")
public class auton extends LinearOpMode {
    robot robot = new robot();


    @Override
    public void runOpMode() {
        robot.init(hardwareMap);
        waitForStart();
        if (opModeIsActive()) {
            robot.driveForward (10, 0.5);
        }
    }
}

