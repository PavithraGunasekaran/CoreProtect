package net.coreprotect.command;

/**
 * @author Pavithra Gunasekaran
 */
public class ConcreteCreatorInspectCommand extends Creator {
    @Override
    public Command createCommand() {
        return new InspectCommand();
    }
}
