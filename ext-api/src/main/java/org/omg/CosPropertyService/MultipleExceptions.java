package org.omg.CosPropertyService;

/**
 * Generated from IDL exception "MultipleExceptions".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:24 AM
 */

public final class MultipleExceptions
	extends org.omg.CORBA.UserException
{
	public MultipleExceptions()
	{
		super(org.omg.CosPropertyService.MultipleExceptionsHelper.id());
	}

	public org.omg.CosPropertyService.PropertyException[] exceptions;
	public MultipleExceptions(java.lang.String _reason,org.omg.CosPropertyService.PropertyException[] exceptions)
	{
		super(_reason);
		this.exceptions = exceptions;
	}
	public MultipleExceptions(org.omg.CosPropertyService.PropertyException[] exceptions)
	{
		super(org.omg.CosPropertyService.MultipleExceptionsHelper.id());
		this.exceptions = exceptions;
	}
}
