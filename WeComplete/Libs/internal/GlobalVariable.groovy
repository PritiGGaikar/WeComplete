package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object shortTime
     
    /**
     * <p>Profile default : Application login URL</p>
     */
    public static Object baseEAUrl
     
    /**
     * <p></p>
     */
    public static Object buyer
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object longTime
     
    /**
     * <p></p>
     */
    public static Object estateAgent
     
    /**
     * <p></p>
     */
    public static Object solicitor
     
    /**
     * <p></p>
     */
    public static Object baseSFUrl
     
    /**
     * <p></p>
     */
    public static Object baseurl
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            shortTime = selectedVariables['shortTime']
            baseEAUrl = selectedVariables['baseEAUrl']
            buyer = selectedVariables['buyer']
            Password = selectedVariables['Password']
            longTime = selectedVariables['longTime']
            estateAgent = selectedVariables['estateAgent']
            solicitor = selectedVariables['solicitor']
            baseSFUrl = selectedVariables['baseSFUrl']
            baseurl = selectedVariables['baseurl']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
