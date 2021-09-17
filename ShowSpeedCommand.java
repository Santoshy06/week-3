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
public class ShowSpeedCommand implements Command {
    Speed speed;
    ShowSpeedCommand(Speed speed)
    {
        this.speed=speed;
    }
    public void execute()
    {
        speed.showCurrentSpeed();
    }
}
