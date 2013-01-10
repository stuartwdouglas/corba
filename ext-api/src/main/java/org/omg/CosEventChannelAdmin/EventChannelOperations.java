package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "EventChannel".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public interface EventChannelOperations
{
	/* constants */
	/* operations  */
	org.omg.CosEventChannelAdmin.ConsumerAdmin for_consumers();
	org.omg.CosEventChannelAdmin.SupplierAdmin for_suppliers();
	void destroy();
}
