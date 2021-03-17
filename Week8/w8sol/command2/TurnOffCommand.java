// COMPLETE THIS CLASS

public class TurnOffCommand implements Command {

    SoundSystem receiver;

    public TurnOffCommand(SoundSystem soundSystem) {
        receiver = soundSystem;
    }

    public void execute() {
        receiver.turnOff();
    }
}
