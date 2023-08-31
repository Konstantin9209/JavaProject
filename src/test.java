import java.util.HashMap;

public class test {
    ChromeOptions browserOptions = new ChromeOptions();
browserOptions.setPlatformName("Windows 10");
browserOptions.setBrowserVersion("117.0");
    HashMap<String, Object> ltOptions = new HashMap<String, Object>();
ltOptions.put("username", "konstantin.z.petkov");
ltOptions.put("accessKey", "NT52dtUFCRS0mjwrb2pjm3E9TKyba7JlykiLKW2NwZlHSa2mNr");
ltOptions.put("video", true);
ltOptions.put("build", "Konstantin");
ltOptions.put("project", "Automation");
ltOptions.put("smartUI.project", "First_UI");
ltOptions.put("name", "Start");
ltOptions.put("w3c", true);
ltOptions.put("plugin", "java-java");
browserOptions.setCapability("LT:Options", ltOptions);
}
