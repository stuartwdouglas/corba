package org.omg.BiDirPolicy;

/**
 * Generated from IDL interface "BidirectionalPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class BidirectionalPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public BidirectionalPolicy value;
	public BidirectionalPolicyHolder()
	{
	}
	public BidirectionalPolicyHolder (final BidirectionalPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BidirectionalPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BidirectionalPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BidirectionalPolicyHelper.write (_out,value);
	}
}
