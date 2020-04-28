package design_patterns.command.demo1_derek_banas;

//client-->invoker(has a command)-->command(has a receiver)-->receiver
public interface Command {

    void execute();

    void undo();
}
