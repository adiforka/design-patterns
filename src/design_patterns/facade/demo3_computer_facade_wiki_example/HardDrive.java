package design_patterns.facade.demo3_computer_facade_wiki_example;

public class HardDrive {

    public byte[] read(long lba, int size) {
        System.out.println("Reading from drive");
        return null;
    }
}
