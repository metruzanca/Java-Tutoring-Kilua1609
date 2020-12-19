package it.unibo.oop.lab04.robot.arms;
import it.unibo.oop.lab04.robot.base.BaseRobot;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {

    private BasicArm[] arms;
    private int carriedItemsCount;

    public RobotWithTwoArms(String robotName) {
        super(robotName);
        this.arms = new BasicArm[] {
            new BasicArm("right"),
            new BasicArm("left"),
        };
        
    }

    @Override
    public boolean pickUp() {
      if(carriedItemsCount == 2) {
        return false;
      }
      if(arms[carriedItemsCount].pickUp()) {
        this.consumeBattery(arms[carriedItemsCount].getConsuptionForPickUp());
        carriedItemsCount++;
        return true;
      }
      return false;
    }

    @Override
    public boolean dropDown() {
        if(carriedItemsCount == 0) {
            return false;
        }
        if(arms[carriedItemsCount-1].dropDown()) {
            this.consumeBattery(arms[carriedItemsCount-1].getConsuptionForDropDown());
            carriedItemsCount--;
            return true;
        }
        return false;
    }

    @Override
    public int getCarriedItemsCount() {
        return carriedItemsCount;
    }
    
}
