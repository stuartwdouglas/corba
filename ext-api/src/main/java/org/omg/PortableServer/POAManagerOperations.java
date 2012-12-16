package org.omg.PortableServer;


/**
 * Generated from IDL interface "POAManager".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public interface POAManagerOperations
{
	/* constants */
	/* operations  */
	void activate() throws org.omg.PortableServer.POAManagerPackage.AdapterInactive;
	void hold_requests(boolean wait_for_completion) throws org.omg.PortableServer.POAManagerPackage.AdapterInactive;
	void discard_requests(boolean wait_for_completion) throws org.omg.PortableServer.POAManagerPackage.AdapterInactive;
	void deactivate(boolean etherealize_objects, boolean wait_for_completion) throws org.omg.PortableServer.POAManagerPackage.AdapterInactive;
	org.omg.PortableServer.POAManagerPackage.State get_state();
}
