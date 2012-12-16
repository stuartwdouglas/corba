package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public interface CurrentOperations
	extends org.omg.CORBA.CurrentOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Any get_slot(int id) throws org.omg.PortableInterceptor.InvalidSlot;
	void set_slot(int id, org.omg.CORBA.Any data) throws org.omg.PortableInterceptor.InvalidSlot;
}
