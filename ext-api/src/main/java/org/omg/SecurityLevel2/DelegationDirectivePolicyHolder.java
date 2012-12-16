package org.omg.SecurityLevel2;

/**
 * Generated from IDL interface "DelegationDirectivePolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class DelegationDirectivePolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public DelegationDirectivePolicy value;
	public DelegationDirectivePolicyHolder()
	{
	}
	public DelegationDirectivePolicyHolder (final DelegationDirectivePolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DelegationDirectivePolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DelegationDirectivePolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DelegationDirectivePolicyHelper.write (_out,value);
	}
}
