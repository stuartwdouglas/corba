package org.omg.CosTime;
/**
 * Generated from IDL enum "ComparisonType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class ComparisonTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ComparisonType value;

	public ComparisonTypeHolder ()
	{
	}
	public ComparisonTypeHolder (final ComparisonType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ComparisonTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ComparisonTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ComparisonTypeHelper.write (out,value);
	}
}
