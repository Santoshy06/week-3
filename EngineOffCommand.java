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
public class EngineOffCommand implements Command {
    Engine engine;
    EngineOffCommand(Engine engine)
    {
        this.engine=engine;
    }
    public void execute()
    {
        engine.off();
    }
}
