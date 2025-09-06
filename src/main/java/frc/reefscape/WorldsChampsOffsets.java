package frc.reefscape;

import edu.wpi.first.math.util.Units;
import frc.robot.Robot;
import lombok.Getter;

public class WorldsChampsOffsets {

    // red tag offsets
    @Getter private static final double Tag6Offset = meterConverter(24);
    @Getter private static final double Tag7Offset = meterConverter(24);
    @Getter private static final double Tag8Offset = meterConverter(24);
    @Getter private static final double Tag9Offset = meterConverter(24);
    @Getter private static final double Tag10Offset = meterConverter(24);
    @Getter private static final double Tag11Offset = meterConverter(24);

    // blue tag offsets
    @Getter private static final double Tag17Offset = meterConverter(24);
    @Getter private static final double Tag18Offset = meterConverter(24);
    @Getter private static final double Tag19Offset = meterConverter(24);
    @Getter private static final double Tag20Offset = meterConverter(24);
    @Getter private static final double Tag21Offset = meterConverter(24);
    @Getter private static final double Tag22Offset = meterConverter(24);

    // red tag angles offsets
    // Still need to be set up on Worlds Fields
    @Getter private static final double Tag17Angle = radianConverter(60);
    @Getter private static final double Tag18Angle = radianConverter(0);
    @Getter private static final double Tag19Angle = radianConverter(300);
    @Getter private static final double Tag20Angle = radianConverter(240);
    @Getter private static final double Tag21Angle = radianConverter(180);
    @Getter private static final double Tag22Angle = radianConverter(120);

    // blue tag angles offsets
    // Still need to be set up on Worlds Fields
    @Getter private static final double Tag6Angle = radianConverter(120);
    @Getter private static final double Tag7Angle = radianConverter(180);
    @Getter private static final double Tag8Angle = radianConverter(240);
    @Getter private static final double Tag9Angle = radianConverter(300);
    @Getter private static final double Tag10Angle = radianConverter(0);
    @Getter private static final double Tag11Angle = radianConverter(60);

    /**
     * Converts inches to meters and adds half the robot length to the offset
     *
     * @param offsetInches
     * @return
     */
    private static double meterConverter(double offsetInches) {
        double meterConversion = Units.inchesToMeters(offsetInches);
        double halfRobotLength = Robot.getSwerve().getConfig().getRobotLength() / 2;

        return meterConversion + halfRobotLength;
    }

    /** @param degrees */
    private static double radianConverter(double offsetDegrees) {
        double radianConversion = Units.degreesToRadians(offsetDegrees);

        return radianConversion;
    }

    // tag offsets ordered from blue tags to red tags due to centerFaces index values
    @Getter
    private static final double[][] tagOffsets = {
        {17, Tag17Offset, Tag17Angle},
        {18, Tag18Offset, Tag18Angle},
        {19, Tag19Offset, Tag19Angle},
        {20, Tag20Offset, Tag20Angle},
        {21, Tag21Offset, Tag21Angle},
        {22, Tag22Offset, Tag22Angle},
        {6, Tag6Offset, Tag6Angle},
        {7, Tag7Offset, Tag7Angle},
        {8, Tag8Offset, Tag8Angle},
        {9, Tag9Offset, Tag9Angle},
        {10, Tag10Offset, Tag10Angle},
        {11, Tag11Offset, Tag11Angle}
    };
}
