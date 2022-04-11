package net.coreprotect.command;

/**
 * @author Pavithra Gunasekaran
 */
public class ConcreteCreatorReloadCommand extends Creator{
    @Override
    public Command createCommand() {
        return new ReloadCommand();
    }
}
