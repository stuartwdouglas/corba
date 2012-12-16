package org.omg.CosBridgeAdmin;


/**
 * Generated from IDL interface "Bridge".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class BridgeHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosBridgeAdmin.Bridge s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosBridgeAdmin.Bridge extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosBridgeAdmin/Bridge:1.0", "Bridge");
	}
	public static String id()
	{
		return "IDL:omg.org/CosBridgeAdmin/Bridge:1.0";
	}
	public static Bridge read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosBridgeAdmin._BridgeStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosBridgeAdmin.Bridge s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosBridgeAdmin.Bridge narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosBridgeAdmin.Bridge)
		{
			return (org.omg.CosBridgeAdmin.Bridge)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosBridgeAdmin/Bridge:1.0"))
		{
			org.omg.CosBridgeAdmin._BridgeStub stub;
			stub = new org.omg.CosBridgeAdmin._BridgeStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosBridgeAdmin.Bridge unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosBridgeAdmin.Bridge)
		{
			return (org.omg.CosBridgeAdmin.Bridge)obj;
		}
		else
		{
			org.omg.CosBridgeAdmin._BridgeStub stub;
			stub = new org.omg.CosBridgeAdmin._BridgeStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
