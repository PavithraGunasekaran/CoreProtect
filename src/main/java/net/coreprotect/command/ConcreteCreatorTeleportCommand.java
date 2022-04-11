package net.coreprotect.command;

/**
 * @author Pavithra Gunasekaran
 */
public class ConcreteCreatorTeleportCommand extends Creator{
    @Override
    public Command createCommand() {
        return new TeleportCommand();
    }
}
