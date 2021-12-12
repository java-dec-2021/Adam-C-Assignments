public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return new String("iPhone "+this.getVersionNumber()+" says "+this.getRingTone());
    }
    @Override
    public String unlock() {
        return new String("Unlocking via Facial Recognition scan.");
    }
    @Override
    public void displayInfo() {
        System.out.println("Phone Info: iPhone "+this.getVersionNumber()+" from "+this.getCarrier());
    }
}