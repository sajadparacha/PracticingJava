package designpatterns.commandpattern.commands.tv;

import designpatterns.commandpattern.commands.Command;
import designpatterns.commandpattern.receiver.ElectronicDevice;

public class TurnOnTVCommand implements Command {
    ElectronicDevice tv;
    public TurnOnTVCommand(ElectronicDevice electronicDevice){
        this.tv=electronicDevice;

    }
    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public void undo() {
        tv.turnOff();
    }
}
