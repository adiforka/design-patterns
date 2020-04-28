package design_patterns.facade.demo3_computer_facade_wiki_example;

public class ComputerFacade {
    private static final long BOOT_ADDRESS = 2342324;
    private static final long BOOT_SECTOR = 20983234;
    private static final int SECTOR_SIZE = 1024;
    private final CPU processor;
    private final HardDrive drive;
    private final Memory ram;

    public ComputerFacade() {
        this.processor = new CPU();
        this.drive = new HardDrive();
        this.ram = new Memory();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, drive.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
