package designpatterns.commandpattern.commands.radio;

import designpatterns.commandpattern.commands.Command;
import designpatterns.commandpattern.receiver.ElectronicDevice;

public class RadioVolumeCommand implements Command {
    ElectronicDevice tv;

    public RadioVolumeCommand(ElectronicDevice tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.increaseVolume();
    }

    @Override
    public void undo() {
        tv.decreaseVolume();
    }
}
