package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL exception "InvalidExternalEndPoints".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class InvalidExternalEndPoints
	extends org.omg.CORBA.UserException
{
	public InvalidExternalEndPoints()
	{
		super(org.omg.CosBridgeAdmin.InvalidExternalEndPointsHelper.id());
	}

	public org.omg.CosBridgeAdmin.ExternalEndpointError[] error;
	public InvalidExternalEndPoints(java.lang.String _reason,org.omg.CosBridgeAdmin.ExternalEndpointError[] error)
	{
		super(_reason);
		this.error = error;
	}
	public InvalidExternalEndPoints(org.omg.CosBridgeAdmin.ExternalEndpointError[] error)
	{
		super(org.omg.CosBridgeAdmin.InvalidExternalEndPointsHelper.id());
		this.error = error;
	}
}
