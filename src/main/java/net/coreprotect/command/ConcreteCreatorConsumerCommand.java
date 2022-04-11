package net.coreprotect.command;

/**
 * @author Pavithra Gunasekaran
 */
public class ConcreteCreatorConsumerCommand extends  Creator {

    @Override
    public Command createCommand() {
        return new ConsumerCommand();
    }
}
