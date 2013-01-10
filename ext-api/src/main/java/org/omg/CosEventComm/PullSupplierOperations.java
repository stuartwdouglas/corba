package org.omg.CosEventComm;


/**
 * Generated from IDL interface "PullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public interface PullSupplierOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Any pull() throws org.omg.CosEventComm.Disconnected;
	org.omg.CORBA.Any try_pull(org.omg.CORBA.BooleanHolder has_event) throws org.omg.CosEventComm.Disconnected;
	void disconnect_pull_supplier();
}
