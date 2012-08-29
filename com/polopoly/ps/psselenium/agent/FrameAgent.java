package com.polopoly.ps.psselenium.agent;

import org.openqa.selenium.WebDriver;

/**
 * This agent selects a HTML frame to set the current Selenium frame context.  
 */
public class FrameAgent {

    private final GUIAgent guiAgent;

    public FrameAgent(GUIAgent guiAgent) {
        this.guiAgent = guiAgent;
    }
    
    /**
     * Selects a HTML frame by name or id
     * @param frame the HTML name of the frame
     * @return this agent
     */
    public FrameAgent selectFrame(String frame) {
        
        WebDriver webDriver = guiAgent.getWebDriver();
        webDriver.switchTo().window(webDriver.getWindowHandle());
        webDriver.switchTo().frame(frame);    
        return this;
    }
    
    /**
     * Selects the 'work' frame in the Polopoly Admin GUI
     * @return this agent
     */
    public FrameAgent selectWorkFrame() {
        return selectFrame("work");
    }
    
    /**
     * Selects the 'search' frame in the Polopoly Admin GUI
     * @return this agent
     */
    public FrameAgent selectSearchFrame() {
        return selectFrame("search");
    }
    
    /**
     * Selects the 'nav' frame in the Polopoly Admin GUI
     * @return this agent
     */
    public FrameAgent selectNavFrame() {
        return selectFrame("nav");
    }
    
    /**
     * Selects the 'userSession' frame in the Polopoly Admin GUI
     * @return this agent
     */
    public FrameAgent selectUserSessionFrame() {
        return selectFrame("userSession");
    }
    
    /**
     * Selects the 'preview' frame in the Polopoly Admin GUI
     * @return this agent
     */
    public FrameAgent selectPreviewFrame() {
        return selectFrame("preview");
    }
}
