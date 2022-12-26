package designpatterns.commandpattern.commands.tv;

import designpatterns.commandpattern.commands.Command;
import designpatterns.commandpattern.receiver.ElectronicDevice;

public class TvVolumeCommand implements Command {
    ElectronicDevice tv;

    public TvVolumeCommand(ElectronicDevice tv) {
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
