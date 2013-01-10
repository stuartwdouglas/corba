package org.omg.ATLAS;

/**
 * Generated from IDL exception "IllegalTokenRequest".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class IllegalTokenRequest
	extends org.omg.CORBA.UserException
{
	public IllegalTokenRequest()
	{
		super(org.omg.ATLAS.IllegalTokenRequestHelper.id());
	}

	public int the_errnum;
	public java.lang.String the_reason = "";
	public IllegalTokenRequest(java.lang.String _reason,int the_errnum, java.lang.String the_reason)
	{
		super(_reason);
		this.the_errnum = the_errnum;
		this.the_reason = the_reason;
	}
	public IllegalTokenRequest(int the_errnum, java.lang.String the_reason)
	{
		super(org.omg.ATLAS.IllegalTokenRequestHelper.id());
		this.the_errnum = the_errnum;
		this.the_reason = the_reason;
	}
}
