package com.techbank.cqrs.core.commands;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHanndler(Class<T> type, CommandHandlerMethod<T> handler);

    void send(BaseCommand command);
}
