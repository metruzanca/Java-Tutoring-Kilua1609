package it.unibo.oop.lab04.robot.test;

/*
 * TODO: Uncomment the imports
 */
import it.unibo.oop.lab04.robot.arms.RobotWithArms;
import it.unibo.oop.lab04.robot.arms.RobotWithTwoArms;
import it.unibo.oop.lab04.robot.base.BaseRobot;
import it.unibo.oop.lab04.robot.base.RobotPosition;

/**
 * Utility class for testing componible robots
 * 
 */
public final class TestRobotWithArms {

    private static final int CYCLES = 10;

    private TestRobotWithArms() {
    }

    private static void assertEquality(final String propertyName, final Object expected, final Object actual, final int pos) {
        if (actual == null || !actual.equals(expected)) {
            System.out.println(propertyName + " was expected to be " + expected
                    + ", but it yields " + actual + " (ERROR!) " + pos);
        } else {
            System.out.println(propertyName + ": " + actual + " (CORRECT)");
        }
    }

    public static void main(final String[] args) {
        /*
         * TODO: uncomment this test.
         * 
         * You can uncomment blocks of code in eclipse by using:
         * 
         * Control + Shift + 7 (With an Italian keyboard...)
         */
       final RobotWithArms walle = new RobotWithTwoArms("Wall-e");
       final String wallePosition = walle + "'s position";
       final String walleItems = walle + "'s items carried";
       final String walleConsumption = walle + "'s consumption";
       assertEquality(wallePosition, new RobotPosition(0, 0), walle.getPosition(), 43);
       assertEquality(walleConsumption, BaseRobot.BATTERY_FULL, walle.getBatteryLevel(), 44);
       double consumptionEmpty = walle.getBatteryLevel();
       for (int i = 0; i < CYCLES; i++) {
           walle.moveRight();
       }
       consumptionEmpty -= walle.getBatteryLevel();
       walle.pickUp();
       assertEquality(walleItems, 1, walle.getCarriedItemsCount(), 51);
       double consumption1Item = walle.getBatteryLevel();
       for (int i = 0; i < CYCLES; i++) {
           walle.moveUp();
       }
       consumption1Item -= walle.getBatteryLevel();
       assertEquality(walleConsumption, true, consumption1Item > consumptionEmpty, 57);
       walle.pickUp();
       assertEquality(walleItems, 2, walle.getCarriedItemsCount(), 59);
       double consumption2Item = walle.getBatteryLevel();
       for (int i = 0; i < CYCLES; i++) {
           walle.moveUp();
       }
       consumption2Item -= walle.getBatteryLevel();
       assertEquality(walleConsumption, true, consumption2Item > consumption1Item, 65);
       walle.pickUp();
       assertEquality(walleItems, 2, walle.getCarriedItemsCount(), 67);
       walle.dropDown();
       assertEquality(walleItems, 1, walle.getCarriedItemsCount(), 69);
       walle.dropDown();
       assertEquality(walleItems, 0, walle.getCarriedItemsCount(), 71);
       walle.dropDown();
       assertEquality(walleItems, 0, walle.getCarriedItemsCount(), 73);
    }
}
