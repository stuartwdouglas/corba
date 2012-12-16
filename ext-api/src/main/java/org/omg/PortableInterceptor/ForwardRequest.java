package org.omg.PortableInterceptor;

/**
 * Generated from IDL exception "ForwardRequest".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class ForwardRequest
	extends org.omg.CORBA.UserException
{
	public ForwardRequest()
	{
		super(org.omg.PortableInterceptor.ForwardRequestHelper.id());
	}

	public org.omg.CORBA.Object forward;
	public ForwardRequest(java.lang.String _reason,org.omg.CORBA.Object forward)
	{
		super(_reason);
		this.forward = forward;
	}
	public ForwardRequest(org.omg.CORBA.Object forward)
	{
		super(org.omg.PortableInterceptor.ForwardRequestHelper.id());
		this.forward = forward;
	}
}
