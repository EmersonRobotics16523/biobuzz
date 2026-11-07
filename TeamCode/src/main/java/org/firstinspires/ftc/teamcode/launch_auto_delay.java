package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "launch_auto_delay")

public class launch_auto_delay extends LinearOpMode{
    @Override
    public void runOpMode() {
        robot robot = new robot();
        waitForStart();
        if(opModeIsActive()) {
            robot.init ( hardwareMap);
            sleep(20000);
            robot.handlerMotor.setPower(1);
            robot.launcherMotor1.setPower(1);
            robot.launcherMotor2.setPower(1);
            sleep(5000);
            robot.handlerMotor.setPower(0);
            robot.launcherMotor1.setPower(0);
            robot.launcherMotor2.setPower(0);
            robot.driveForward(100, 1);
        }
    }
}
