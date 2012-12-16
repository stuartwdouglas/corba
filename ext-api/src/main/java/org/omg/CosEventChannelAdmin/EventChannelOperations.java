package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "EventChannel".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:42 PM
 */

public interface EventChannelOperations
{
	/* constants */
	/* operations  */
	org.omg.CosEventChannelAdmin.ConsumerAdmin for_consumers();
	org.omg.CosEventChannelAdmin.SupplierAdmin for_suppliers();
	void destroy();
}
