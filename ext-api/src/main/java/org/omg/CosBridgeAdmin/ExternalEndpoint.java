package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL struct "ExternalEndpoint".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class ExternalEndpoint
	implements org.omg.CORBA.portable.IDLEntity
{
	public ExternalEndpoint(){}
	public org.omg.CosBridgeAdmin.ExternalEndpointRole role;
	public org.omg.CosBridgeAdmin.ExternalEndpointConnector connector;
	public org.omg.CosBridgeAdmin.FlowStyle style;
	public org.omg.CosBridgeAdmin.MessageType type;
	public ExternalEndpoint(org.omg.CosBridgeAdmin.ExternalEndpointRole role, org.omg.CosBridgeAdmin.ExternalEndpointConnector connector, org.omg.CosBridgeAdmin.FlowStyle style, org.omg.CosBridgeAdmin.MessageType type)
	{
		this.role = role;
		this.connector = connector;
		this.style = style;
		this.type = type;
	}
}
