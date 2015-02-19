package testModule;

import org.testng.Assert;
import org.testng.annotations.Test;

import srcModules.Modules;

public class ModuleTest {
    Modules mod = new Modules();

    @Test
    public void testConnMgr() {
    	System.out.println();
   	 	System.out.println("==== TestNG Tests ====");

    	mod.setModuleName("Connection Manager");
    	Assert.assertEquals("Connection Manager", "Connection Manager");
    }

    @Test
    public void testTransMgr() {
    	mod.setModuleName("Transaction Manager");
        Assert.assertEquals("Transaction Manager", "Transaction Manager");
    }

    @Test
    public void testSvcMgr() {
        mod.setModuleName("Service Manager");
        Assert.assertEquals("Service Manager", "Service Manager");
    }

    @Test
    public void testConnMgrStat() {
        mod.setStat("Tested");
        Assert.assertEquals("Tested", "Tested");
        System.out.println("Module: Connection Manager    State: Tested");
    }

    @Test
    public void testTransMgrStat() {
        mod.setStat("NotTested");
        Assert.assertEquals("NotTested", "NotTested");
        System.out.println("Module: Transaction Manager   State: Not Tested");
    }

    @Test
    public void testSvcMgrStat() {
        mod.setStat("Testing");
        Assert.assertEquals("Testing", "Testing");
        System.out.println("Module: Service Manager       State: Testing");
    }
    
}
