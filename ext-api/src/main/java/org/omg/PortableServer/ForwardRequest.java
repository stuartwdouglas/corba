package org.omg.PortableServer;

/**
 * Generated from IDL exception "ForwardRequest".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class ForwardRequest
	extends org.omg.CORBA.UserException
{
	public ForwardRequest()
	{
		super(org.omg.PortableServer.ForwardRequestHelper.id());
	}

	public org.omg.CORBA.Object forward_reference;
	public ForwardRequest(java.lang.String _reason,org.omg.CORBA.Object forward_reference)
	{
		super(_reason);
		this.forward_reference = forward_reference;
	}
	public ForwardRequest(org.omg.CORBA.Object forward_reference)
	{
		super(org.omg.PortableServer.ForwardRequestHelper.id());
		this.forward_reference = forward_reference;
	}
}
