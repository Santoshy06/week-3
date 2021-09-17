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
public class EngineOnCommand implements Command{
    Engine engine;
    public EngineOnCommand(Engine engine)
    {
        this.engine=engine;
    }
    public void execute()
    {
        engine.on();
    }
    
}
