package org.omg.Security;
/**
 * Generated from IDL enum "SecurityFeature".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class SecurityFeatureHolder
	implements org.omg.CORBA.portable.Streamable
{
	public SecurityFeature value;

	public SecurityFeatureHolder ()
	{
	}
	public SecurityFeatureHolder (final SecurityFeature initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SecurityFeatureHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SecurityFeatureHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SecurityFeatureHelper.write (out,value);
	}
}