package org.omg.SecurityReplaceable;

/**
 * Generated from IDL interface "Vault".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class VaultHolder	implements org.omg.CORBA.portable.Streamable{
	 public Vault value;
	public VaultHolder()
	{
	}
	public VaultHolder (final Vault initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return VaultHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = VaultHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		VaultHelper.write (_out,value);
	}
}
