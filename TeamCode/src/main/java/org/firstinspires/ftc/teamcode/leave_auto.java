package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "leave_auto v3.1")

public class leave_auto extends LinearOpMode{
    @Override
    public void runOpMode() {
        robot robot = new robot();
        waitForStart();
        if(opModeIsActive()) {
            robot.init ( hardwareMap);
            robot.driveForward(10, 1);

        }
    }
}
