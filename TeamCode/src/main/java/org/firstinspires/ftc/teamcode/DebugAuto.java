package org.firstinspires.ftc.teamcode;
//EXIST
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="Debug Autonomous", group ="test")
public class DebugAuto extends LinearOpMode {

    public DcMotor frontLeft;
    public DcMotor backLeft;
    public DcMotor frontRight;
    public DcMotor backRight;

    @Override public void runOpMode() {
        //initialization
        Navigation nav = new Navigation(this,telemetry, true,false, true,true);

        waitForStart();

        nav.goDistance(100f,50f);
        nav.rotateTo(100f, 200f, 10f);
        nav.rotateTo(270f, 200f, 10f);
        nav.rotateTo(0f, 200f, 10f);
        nav.rotateTo(200f, 200f, 10f);

        nav.stopAllMotors();

    }


}
