package design_patterns.command.demo2_okhravi;

//the methods in command take no arguments, because, through a receiver object, they encapsulate
//the action that is to be executed, and need no input from the outside, it already has an instance of
//receiver at instantiation
public interface Command {

    //command-query separation (commands perform actions and need not have a return type other than void)
    //queries umm query
    void execute();

    void undo();
}
