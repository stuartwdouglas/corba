package org.omg.CosTypedNotifyComm;


/**
 * Generated from IDL interface "TypedPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class TypedPullSupplierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTypedNotifyComm.TypedPullSupplier s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTypedNotifyComm.TypedPullSupplier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTypedNotifyComm/TypedPullSupplier:1.0", "TypedPullSupplier");
	}
	public static String id()
	{
		return "IDL:omg.org/CosTypedNotifyComm/TypedPullSupplier:1.0";
	}
	public static TypedPullSupplier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosTypedNotifyComm._TypedPullSupplierStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTypedNotifyComm.TypedPullSupplier s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTypedNotifyComm.TypedPullSupplier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedNotifyComm.TypedPullSupplier)
		{
			return (org.omg.CosTypedNotifyComm.TypedPullSupplier)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosTypedNotifyComm/TypedPullSupplier:1.0"))
		{
			org.omg.CosTypedNotifyComm._TypedPullSupplierStub stub;
			stub = new org.omg.CosTypedNotifyComm._TypedPullSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTypedNotifyComm.TypedPullSupplier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedNotifyComm.TypedPullSupplier)
		{
			return (org.omg.CosTypedNotifyComm.TypedPullSupplier)obj;
		}
		else
		{
			org.omg.CosTypedNotifyComm._TypedPullSupplierStub stub;
			stub = new org.omg.CosTypedNotifyComm._TypedPullSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
