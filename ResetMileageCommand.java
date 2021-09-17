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
public class ResetMileageCommand implements Command {
    Mileage mileage;
    ResetMileageCommand(Mileage mileage)
    {
        this.mileage=mileage;
    }
    public void execute()
    {
        mileage.resetMileage();
    }
}
