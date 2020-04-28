package design_patterns.facade.demo3_computer_facade_wiki_example;

public class CPU {
    public void freeze() {
        System.out.println("Freezing");
    }

    public void jump(long position) {
        System.out.println("Jumping to position: " + position);
    }

    public void execute() {
        System.out.println("Executing");
    }
}
