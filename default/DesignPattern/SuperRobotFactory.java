package DesignPattern;

import java.awt.*;

public class SuperRobotFactory extends abstRobotFactory{
    @Override
    Robot createRobot(String name) {
        switch (name) {
//            case "super":
//                return new SuperRobot();
//            case "power":
//                return new PowerRobot();
        }
        return null;
    }
}
