package org.omg.CORBA;
/**
 * Generated from IDL enum "DefinitionKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class DefinitionKindHolder
	implements org.omg.CORBA.portable.Streamable
{
	public DefinitionKind value;

	public DefinitionKindHolder ()
	{
	}
	public DefinitionKindHolder (final DefinitionKind initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DefinitionKindHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DefinitionKindHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DefinitionKindHelper.write (out,value);
	}
}
