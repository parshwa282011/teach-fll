package org.firstinspires.ftc.teamcode.EXAMPLES;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "EXAMPLE2")
public class EXAMPLE2HELLOWORLD extends LinearOpMode {
    //INIT variables here
    @Override
    public void runOpMode() throws InterruptedException {
        //INIT here
        while(opModeInInit()){
            //your code for init
            //then once done initing do the bellow to show your done
            break;
        }
        //then say your done in telementery
        telemetry.addLine("Code has been initilized");
        telemetry.update();
        //update the telementery to show it
        //THEN YOUR LOOP
        while(opModeIsActive()){
            //your program here
            telemetry.addLine("Program Running");
            telemetry.update();
        }
    }
}
