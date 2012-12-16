package org.omg.Security;

/**
 * Generated from IDL struct "OptionsDirectionPair".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class OptionsDirectionPairHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.OptionsDirectionPair value;

	public OptionsDirectionPairHolder ()
	{
	}
	public OptionsDirectionPairHolder(final org.omg.Security.OptionsDirectionPair initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.Security.OptionsDirectionPairHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.Security.OptionsDirectionPairHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.Security.OptionsDirectionPairHelper.write(_out, value);
	}
}
