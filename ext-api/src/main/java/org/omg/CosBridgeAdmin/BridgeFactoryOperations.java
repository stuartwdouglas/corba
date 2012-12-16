package org.omg.CosBridgeAdmin;


/**
 * Generated from IDL interface "BridgeFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public interface BridgeFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosBridgeAdmin.Bridge create_bridge(org.omg.CosBridgeAdmin.ExternalEndpoint source, org.omg.CosBridgeAdmin.ExternalEndpoint sink, org.omg.CORBA.IntHolder id) throws org.omg.CosBridgeAdmin.InvalidExternalEndPoints;
	org.omg.CosBridgeAdmin.Bridge get_bridge_with_id(int id) throws org.omg.CosBridgeAdmin.BridgeNotFound;
	int[] get_all_bridges();
}
