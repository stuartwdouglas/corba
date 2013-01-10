package org.omg.CosCollection;

/**
 * Generated from IDL exception "ParameterInvalid".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public final class ParameterInvalid
	extends org.omg.CORBA.UserException
{
	public ParameterInvalid()
	{
		super(org.omg.CosCollection.ParameterInvalidHelper.id());
	}

	public int which;
	public java.lang.String why;
	public ParameterInvalid(java.lang.String _reason,int which, java.lang.String why)
	{
		super(_reason);
		this.which = which;
		this.why = why;
	}
	public ParameterInvalid(int which, java.lang.String why)
	{
		super(org.omg.CosCollection.ParameterInvalidHelper.id());
		this.which = which;
		this.why = why;
	}
}
