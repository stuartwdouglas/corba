package org.omg.ATLAS;

/**
 * Generated from IDL union "ATLASLocator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class ATLASLocatorHelper
{
	private static org.omg.CORBA.TypeCode _type;
	public static void insert (final org.omg.CORBA.Any any, final org.omg.ATLAS.ATLASLocator s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.ATLAS.ATLASLocator extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/ATLAS/ATLASLocator:1.0";
	}
	public static ATLASLocator read (org.omg.CORBA.portable.InputStream in)
	{
		ATLASLocator result = new ATLASLocator ();
		int disc=in.read_ulong();
		switch (disc)
		{
			case 1:
			{
				org.omg.ATLAS.CosNamingLocator _var;
				_var=org.omg.ATLAS.CosNamingLocatorHelper.read(in);
				result.naming_locator (_var);
				break;
			}
			case 2:
			{
				java.lang.String _var;
				_var=in.read_string();
				result.the_url (_var);
				break;
			}
			case 3:
			{
				org.omg.ATLAS.AuthTokenDispenser _var;
				_var=org.omg.ATLAS.AuthTokenDispenserHelper.read(in);
				result.the_dispenser (_var);
				break;
			}
			default: result.__default (disc);
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, ATLASLocator s)
	{
		out.write_ulong(s.discriminator ());
		switch (s.discriminator ())
		{
			case 1:
			{
				org.omg.ATLAS.CosNamingLocatorHelper.write(out,s.naming_locator ());
				break;
			}
			case 2:
			{
				out.write_string(s.the_url ());
				break;
			}
			case 3:
			{
				org.omg.ATLAS.AuthTokenDispenserHelper.write(out,s.the_dispenser ());
				break;
			}
		}
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[3];
			org.omg.CORBA.Any label_any;
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_ulong (1);
			members[0] = new org.omg.CORBA.UnionMember ("naming_locator", label_any, org.omg.ATLAS.CosNamingLocatorHelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_ulong (2);
			members[1] = new org.omg.CORBA.UnionMember ("the_url", label_any, org.omg.ATLAS.URLocatorHelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_ulong (3);
			members[2] = new org.omg.CORBA.UnionMember ("the_dispenser", label_any, org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/ATLAS/AuthTokenDispenser:1.0", "AuthTokenDispenser"),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"ATLASLocator",org.omg.ATLAS.ATLASLocatorTypeHelper.type(), members);
		}
		return _type;
	}
}
