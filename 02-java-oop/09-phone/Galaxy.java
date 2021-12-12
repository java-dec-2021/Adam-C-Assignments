public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return new String("Galaxy "+this.getVersionNumber()+" says "+this.getRingTone());
    }
    @Override
    public String unlock() {
        return new String("Unlocking via Fingerprint scan.");
    }
    @Override
    public void displayInfo() {
        System.out.println("Phone Info: Galaxy "+this.getVersionNumber()+" from "+this.getCarrier());
    }
}