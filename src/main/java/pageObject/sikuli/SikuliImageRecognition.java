package pageObject.sikuli;

import java.io.File;

import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopMouse;

public class SikuliImageRecognition {
	
	private ScreenRegion sRegion;

	public SikuliImageRecognition(){
		sRegion = new DesktopScreenRegion();
	}
	
	public void clickOnImage(String imagename) {
		File buttonPathFile = new File("src\\test\\resources\\images\\" + imagename);                
	    Target imageTarget = new ImageTarget(buttonPathFile);
	    ScreenRegion r = sRegion.wait(imageTarget, 7000);
	    Mouse mouse = new DesktopMouse();
	    mouse.click(r.getCenter());
	}

}
