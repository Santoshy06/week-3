/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorcyclefactory;

/**
 *
 * @author Welcome
 */
public class MotorCycleFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MotorCycle motor=new MotorCycle();
       Acceleration acc=new Acceleration();
       Engine eng=new Engine();
       Mileage mile=new Mileage();
       Speed sp=new Speed();
       motor.setCommand(new EngineOnCommand(eng));
       motor.buttonPressed();
       motor.setCommand(new AccelerationIncreaseCommand(acc));
       motor.buttonPressed();
       motor.setCommand(new ShowSpeedCommand(sp));
       motor.buttonPressed();
       motor.setCommand(new AccelerationDecreaseCommand(acc));
       motor.buttonPressed();
       motor.setCommand(new ShowSpeedCommand(sp));
       motor.buttonPressed();
       motor.setCommand(new EngineOffCommand(eng));
       motor.buttonPressed();
       motor.setCommand(new DontShowSpeedCommand(sp));
       motor.buttonPressed();
       motor.setCommand(new ResetMileageCommand(mile));
       motor.buttonPressed();
       
    }
    
}
