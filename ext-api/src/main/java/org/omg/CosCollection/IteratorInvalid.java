package org.omg.CosCollection;

/**
 * Generated from IDL exception "IteratorInvalid".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class IteratorInvalid
	extends org.omg.CORBA.UserException
{
	public IteratorInvalid()
	{
		super(org.omg.CosCollection.IteratorInvalidHelper.id());
	}

	public org.omg.CosCollection.IteratorInvalidReason why;
	public IteratorInvalid(java.lang.String _reason,org.omg.CosCollection.IteratorInvalidReason why)
	{
		super(_reason);
		this.why = why;
	}
	public IteratorInvalid(org.omg.CosCollection.IteratorInvalidReason why)
	{
		super(org.omg.CosCollection.IteratorInvalidHelper.id());
		this.why = why;
	}
}
