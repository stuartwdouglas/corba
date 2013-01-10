package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL struct "JMSDestination".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class JMSDestination
	implements org.omg.CORBA.portable.IDLEntity
{
	public JMSDestination(){}
	public org.omg.CosBridgeAdmin.JMSDestinationType destination_type;
	public java.lang.String destination_name = "";
	public java.lang.String factory_name = "";
	public JMSDestination(org.omg.CosBridgeAdmin.JMSDestinationType destination_type, java.lang.String destination_name, java.lang.String factory_name)
	{
		this.destination_type = destination_type;
		this.destination_name = destination_name;
		this.factory_name = factory_name;
	}
}
