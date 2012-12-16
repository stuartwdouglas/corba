package org.omg.Messaging;

/**
 * Generated from IDL alias "PolicyValueSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class PolicyValueSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Messaging.PolicyValue[] value;

	public PolicyValueSeqHolder ()
	{
	}
	public PolicyValueSeqHolder (final org.omg.Messaging.PolicyValue[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PolicyValueSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PolicyValueSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PolicyValueSeqHelper.write (out,value);
	}
}
