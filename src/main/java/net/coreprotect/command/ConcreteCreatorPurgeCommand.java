package net.coreprotect.command;

/**
 * @author Pavithra Gunasekaran
 */
public class ConcreteCreatorPurgeCommand extends Creator{
    @Override
    public Command createCommand() {
        return new PurgeCommand();
    }
}
