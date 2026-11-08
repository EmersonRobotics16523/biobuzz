package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "launch_auto v2.3")

public class launch_auto extends LinearOpMode{
    @Override
    public void runOpMode() {
        robot robot = new robot();
        waitForStart();
        if(opModeIsActive()) {
            robot.init ( hardwareMap);
            robot.driveForward(5, .5);
            robot.launcherMotor1.setPower(.9);
            robot.launcherMotor2.setPower(.9);
            sleep(2500);
            robot.handlerMotor.setPower(.5);
            sleep(5000);
            robot.handlerMotor.setPower(0);
            robot.launcherMotor1.setPower(0);
            robot.launcherMotor2.setPower(0);
            robot.driveForward(10, 1);
        }
    }
}
