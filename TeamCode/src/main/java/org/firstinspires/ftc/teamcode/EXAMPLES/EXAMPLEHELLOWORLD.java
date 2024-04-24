package org.firstinspires.ftc.teamcode.EXAMPLES;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "EXAMPLE PROGRAM")
public class EXAMPLEHELLOWORLD extends OpMode {

    @Override
    public void init() {
        // Init all your programs here
        telemetry.addLine("Program has initilized");
        telemetry.update();
    }

    @Override
    public void loop() {
        telemetry.addLine("Program running");
        telemetry.update();
    }
}
