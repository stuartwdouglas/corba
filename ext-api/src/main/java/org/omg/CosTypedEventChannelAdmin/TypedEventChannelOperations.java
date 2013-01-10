package org.omg.CosTypedEventChannelAdmin;


/**
 * Generated from IDL interface "TypedEventChannel".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public interface TypedEventChannelOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTypedEventChannelAdmin.TypedConsumerAdmin for_consumers();
	org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin for_suppliers();
	void destroy();
}
