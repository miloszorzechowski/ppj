package ppj12;

public class SmokeDetector {
    public void check(boolean indicator) throws Alarm {
        if (indicator) {
            throw new Alarm();
        }
    }
}