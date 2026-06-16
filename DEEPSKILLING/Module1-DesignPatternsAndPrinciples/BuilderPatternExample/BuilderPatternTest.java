public class BuilderPatternTest {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM(32)
                .setStorage(1000)
                .setGPU("NVIDIA RTX 4090")
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM(16)
                .setStorage(512)
                .setGPU("Integrated Graphics")
                .build();

        System.out.println("Gaming PC Configuration:");
        gamingPC.showConfiguration();

        System.out.println("Office PC Configuration:");
        officePC.showConfiguration();
    }
}