import com.fyayc.essen.busylight.core.Driver;
import com.fyayc.essen.busylight.core.protocol.SpecConstants;
import com.fyayc.essen.busylight.core.protocol.bytes.Tone;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		try (Driver driver = Driver.tryAndAcquire()) {
//			System.out.println("****** PLAYING MUSIC *******");
//			driver.send(SpecConstants.toneSpec(Tone.forTone(SpecConstants.Tones.OPENOFFICE, 1)));
//
//			System.out.println("****** PLAYING STANDARD SPECS *******");
//			for (SpecConstants.StandardSpecs spec : SpecConstants.StandardSpecs.values()) {
//				driver.send(spec);
//				Thread.sleep(2000);
//			}

//			System.out.println("****** PLAYING LIGHT SPECS *******");
//
//			for (SpecConstants.Light light : SpecConstants.Light.values()) {
//				System.out.println(light);
//				driver.send(SpecConstants.lightSpec(light));
//				Thread.sleep(1000);
//			}

			System.out.println("****** PLAYING BLINK SPECS *******");

			for (SpecConstants.Light light : SpecConstants.Light.values()) {
				driver.send(SpecConstants.blinkSpec(light));
				Thread.sleep(5000);
			}
//			driver.send(SpecConstants.StandardSpecs.OFF);
		}
	}
}
