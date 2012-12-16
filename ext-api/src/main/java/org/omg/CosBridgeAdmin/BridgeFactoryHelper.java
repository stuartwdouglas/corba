package org.omg.CosBridgeAdmin;


/**
 * Generated from IDL interface "BridgeFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class BridgeFactoryHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosBridgeAdmin.BridgeFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosBridgeAdmin.BridgeFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosBridgeAdmin/BridgeFactory:1.0", "BridgeFactory");
	}
	public static String id()
	{
		return "IDL:omg.org/CosBridgeAdmin/BridgeFactory:1.0";
	}
	public static BridgeFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosBridgeAdmin._BridgeFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosBridgeAdmin.BridgeFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosBridgeAdmin.BridgeFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosBridgeAdmin.BridgeFactory)
		{
			return (org.omg.CosBridgeAdmin.BridgeFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosBridgeAdmin/BridgeFactory:1.0"))
		{
			org.omg.CosBridgeAdmin._BridgeFactoryStub stub;
			stub = new org.omg.CosBridgeAdmin._BridgeFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosBridgeAdmin.BridgeFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosBridgeAdmin.BridgeFactory)
		{
			return (org.omg.CosBridgeAdmin.BridgeFactory)obj;
		}
		else
		{
			org.omg.CosBridgeAdmin._BridgeFactoryStub stub;
			stub = new org.omg.CosBridgeAdmin._BridgeFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
