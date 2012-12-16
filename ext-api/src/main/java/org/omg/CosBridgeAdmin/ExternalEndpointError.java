package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL struct "ExternalEndpointError".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class ExternalEndpointError
	implements org.omg.CORBA.portable.IDLEntity
{
	public ExternalEndpointError(){}
	public org.omg.CosBridgeAdmin.ExternalEndpointRole role;
	public org.omg.CosBridgeAdmin.ExternalEndpointErrorCode code;
	public ExternalEndpointError(org.omg.CosBridgeAdmin.ExternalEndpointRole role, org.omg.CosBridgeAdmin.ExternalEndpointErrorCode code)
	{
		this.role = role;
		this.code = code;
	}
}
