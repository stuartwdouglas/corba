package org.omg.SecurityReplaceable;


/**
 * Generated from IDL interface "Vault".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class VaultHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.SecurityReplaceable.Vault s)
	{
			any.insert_Object(s);
	}
	public static org.omg.SecurityReplaceable.Vault extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/SecurityReplaceable/Vault:1.0", "Vault");
	}
	public static String id()
	{
		return "IDL:omg.org/SecurityReplaceable/Vault:1.0";
	}
	public static Vault read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.SecurityReplaceable.Vault s)
	{
		_out.write_Object(s);
	}
	public static org.omg.SecurityReplaceable.Vault narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.SecurityReplaceable.Vault)
		{
			return (org.omg.SecurityReplaceable.Vault)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.SecurityReplaceable.Vault unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.SecurityReplaceable.Vault)
		{
			return (org.omg.SecurityReplaceable.Vault)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
