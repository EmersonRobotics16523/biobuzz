package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "launch_delay_strafe")

public class launch_delay_strafe extends LinearOpMode{
    @Override
    public void runOpMode() {
        robot robot = new robot();
        waitForStart();
        if(opModeIsActive()) {
            robot.init ( hardwareMap);
            sleep(18000);
            robot.handlerMotor.setPower(1);
            robot.launcherMotor1.setPower(1);
            robot.launcherMotor2.setPower(1);
            sleep(5000);
            robot.handlerMotor.setPower(0);
            robot.launcherMotor1.setPower(0);
            robot.launcherMotor2.setPower(0);
            robot.driveForward(100, 1);
            robot.strafeRight(1200, 1);
        }
    }
}
