package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class TestNavMethods extends LinearOpMode {
    public void runOpMode() {
        Navigation nav = new Navigation(this, telemetry, true);

        waitForStart();

//        nav.setCollectorExtension(Navigation.CollectorExtension.OUT);
//        nav.setCollectorExtension(Navigation.CollectorExtension.DUMP);
//        nav.setCollectorExtension(Navigation.CollectorExtension.PARK);
//
//        nav.setLiftHeight(Navigation.LiftHeight.SCORE);
//        nav.setLiftHeight(Navigation.LiftHeight.PARK);
//        nav.setLiftHeight(Navigation.LiftHeight.LOWER);
//
//        nav.setCollectorHeight(Navigation.CollectorHeight.LOWER);
//        nav.setCollectorHeight(Navigation.CollectorHeight.PARK);
//        nav.setCollectorHeight(Navigation.CollectorHeight.DUMP);
//
//        nav.setCollectionSweeper(Navigation.CollectorSweeper.INTAKE);
//        nav.setCollectionSweeper(Navigation.CollectorSweeper.OUTTAKE);
//
//        nav.setLiftLock(Navigation.LiftLock.LOCK);
//        nav.setLiftLock(Navigation.LiftLock.UNLOCK);
    }

}
