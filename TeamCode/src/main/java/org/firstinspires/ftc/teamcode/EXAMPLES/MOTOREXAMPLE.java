package org.firstinspires.ftc.teamcode.EXAMPLES;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class MOTOREXAMPLE extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor lfm = hardwareMap.dcMotor.get("lFM");
        DcMotor rfm = hardwareMap.dcMotor.get("rFM");
        DcMotor lbm = hardwareMap.dcMotor.get("lBM");
        DcMotor rbm = hardwareMap.dcMotor.get("rBM");
        waitForStart();
        while (!isStopRequested()){
            if (gamepad1.x){
                lfm.setPower(1);
            } else {
                lfm.setPower(0);
            }
            if (gamepad1.y){
                rfm.setPower(1);
            } else {
                rfm.setPower(0);
            }
            if (gamepad1.a){
                lbm.setPower(1);
            } else {
                lbm.setPower(0);
            }
            if (gamepad1.b){
                rbm.setPower(1);
            } else {
                rbm.setPower(0);
            }
        }
    }
}
