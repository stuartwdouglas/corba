package org.omg.SecurityLevel2;

/**
 * Generated from IDL interface "MechanismPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class MechanismPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public MechanismPolicy value;
	public MechanismPolicyHolder()
	{
	}
	public MechanismPolicyHolder (final MechanismPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MechanismPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MechanismPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MechanismPolicyHelper.write (_out,value);
	}
}
