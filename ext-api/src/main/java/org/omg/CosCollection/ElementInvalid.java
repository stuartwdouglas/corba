package org.omg.CosCollection;

/**
 * Generated from IDL exception "ElementInvalid".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class ElementInvalid
	extends org.omg.CORBA.UserException
{
	public ElementInvalid()
	{
		super(org.omg.CosCollection.ElementInvalidHelper.id());
	}

	public org.omg.CosCollection.ElementInvalidReason why;
	public ElementInvalid(java.lang.String _reason,org.omg.CosCollection.ElementInvalidReason why)
	{
		super(_reason);
		this.why = why;
	}
	public ElementInvalid(org.omg.CosCollection.ElementInvalidReason why)
	{
		super(org.omg.CosCollection.ElementInvalidHelper.id());
		this.why = why;
	}
}
