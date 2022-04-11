package net.coreprotect.command;

/**
 * @author Pavithra Gunasekaran
 */
public class ConcreteCreatorHelpCommand extends Creator{
    @Override
    public Command createCommand() {
        return new HelpCommand();
    }
}
