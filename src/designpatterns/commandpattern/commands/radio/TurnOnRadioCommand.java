package designpatterns.commandpattern.commands.radio;

import designpatterns.commandpattern.commands.Command;
import designpatterns.commandpattern.receiver.ElectronicDevice;

public class TurnOnRadioCommand implements Command {
    ElectronicDevice radio;
    public TurnOnRadioCommand(ElectronicDevice electronicDevice){
        this.radio=electronicDevice;

    }
    @Override
    public void execute() {
        radio.turnOn();
    }

    @Override
    public void undo() {
        radio.turnOff();
    }
}
