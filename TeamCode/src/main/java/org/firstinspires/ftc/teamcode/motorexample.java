package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name="a")
public class motorexample extends LinearOpMode {
    private DcMotor lFM, rFM, lBM, rBM;
    @Override
    public void runOpMode() throws InterruptedException {
        lFM = hardwareMap.dcMotor.get("lFM");
        rFM = hardwareMap.dcMotor.get("rFM");
        lBM = hardwareMap.dcMotor.get("lBM");
        rBM = hardwareMap.dcMotor.get("rBM");
        waitForStart();
        while(!opModeIsActive()){
            if(gamepad1.a){
                lFM.setPower(0.5);
            } else{
                lFM.setPower(0);
            }
            if(gamepad1.b){
                rFM.setPower(0.5);
            } else{
                rFM.setPower(0);
            }
            if(gamepad1.x){
                lBM.setPower(0.5);
            } else{
                lBM.setPower(0);
            }
            if(gamepad1.y){
                rBM.setPower(0.5);
            } else{
                rBM.setPower(0);
            }
        }
    }
}