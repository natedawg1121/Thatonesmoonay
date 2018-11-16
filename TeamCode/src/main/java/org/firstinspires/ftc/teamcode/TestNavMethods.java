package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="Test Nav Methods", group="Test")
public class TestNavMethods extends LinearOpMode {
    public void runOpMode() {
        Navigation nav = new Navigation(this, telemetry, true);

        waitForStart();

//        nav.setCollectorExtension(Navigation.CollectorExtension.OUT);
//        nav.setCollectorExtension(Navigation.CollectorExtension.DUMP);
//        nav.setCollectorExtension(Navigation.CollectorExtension.PARK);
//
//        nav.setLiftHeight(Navigation.LiftHeight.SCORE);
//        nav.setLiftHeight(Navigation.LiftHeight.HOOK);
//        nav.setLiftHeight(Navigation.LiftHeight.LOWER);
//
//        nav.setCollectorHeight(Navigation.CollectorHeight.COLLECT);
//        nav.setCollectorHeight(Navigation.CollectorHeight.DUMP);
//
//        nav.setCollectionSweeper(Navigation.CollectorSweeper.INTAKE);
//        nav.setCollectionSweeper(Navigation.CollectorSweeper.OUTTAKE);

        nav.goDistance(20f);
        nav.holdForDrive();
        nav.pointTurnRelative(180f);
        nav.holdForDrive();
        nav.goDistance(20f);
        nav.holdForDrive();
        nav.pointTurnRelative(180f);
        nav.holdForDrive();
    }

}
