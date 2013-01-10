package org.omg.CosBridgeAdmin;


/**
 * Generated from IDL interface "Bridge".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public interface BridgeOperations
{
	/* constants */
	/* operations  */
	org.omg.CosBridgeAdmin.ExternalEndpoint end_point_receiver();
	org.omg.CosBridgeAdmin.ExternalEndpoint end_point_sender();
	void start_bridge() throws org.omg.CosBridgeAdmin.BridgeAlreadyStarted,org.omg.CosBridgeAdmin.InvalidExternalEndPoints;
	void stop_bridge() throws org.omg.CosBridgeAdmin.BridgeInactive;
	void destroy();
}
