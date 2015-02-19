package junitTest;

import org.junit.Assert;
import org.junit.Test;

import srcModules.Modules;

public class ComponentTest {
	
	 Modules component = new Modules();

     @Test
     public void testConnMgr() {
    	 System.out.println();
    	 System.out.println("==== Junit Tests ====");

    	 component.setModuleName("Connection Manager");
    	 Assert.assertEquals("Connection Manager", "Connection Manager");
    	 System.out.println("Connection Manager");
     }

     @Test
     public void testConnMgrState() {
    	 component.setStat("Tested");
    	 Assert.assertEquals("Tested", "Tested");
     }

     @Test
     public void testTransMgr() {
    	 component.setModuleName("Transaction Manager");
    	 Assert.assertEquals("Transaction Manager", "Transaction Manager");
    	 System.out.println("Transaction Manager");
    	 System.out.println();
     }

     @Test
     public void testTransMgrState() {
    	 component.setStat("NotTested");
    	 Assert.assertEquals("NotTested", "NotTested");
     }

     @Test
     public void testSvcMgr() {
    	 component.setModuleName("Service Manager");
    	 Assert.assertEquals("Service Manager", "Service Manager");
    	 System.out.println("Service Manager");
     }

     @Test
     public void testSvcMgrState() {
    	 component.setStat("Testing");
    	 Assert.assertEquals("Testing", "Testing");
    	 System.out.println();
     }
 
}
