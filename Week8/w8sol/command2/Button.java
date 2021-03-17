// COMPLETE THIS CLASS (You can use RemoteControl.java from command package as reference)
public class Button {
    Command activeCommand;

    public Button() { }

    public void setCommand(Command command) {
        activeCommand = command;
    }

    public void press() {
        activeCommand.execute();
    }
}

