package org.omg.CosNotifyComm;


/**
 * Generated from IDL interface "StructuredPullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class StructuredPullSupplierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyComm.StructuredPullSupplier s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyComm.StructuredPullSupplier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyComm/StructuredPullSupplier:1.0", "StructuredPullSupplier");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/StructuredPullSupplier:1.0";
	}
	public static StructuredPullSupplier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotifyComm._StructuredPullSupplierStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyComm.StructuredPullSupplier s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyComm.StructuredPullSupplier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyComm.StructuredPullSupplier)
		{
			return (org.omg.CosNotifyComm.StructuredPullSupplier)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotifyComm/StructuredPullSupplier:1.0"))
		{
			org.omg.CosNotifyComm._StructuredPullSupplierStub stub;
			stub = new org.omg.CosNotifyComm._StructuredPullSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotifyComm.StructuredPullSupplier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyComm.StructuredPullSupplier)
		{
			return (org.omg.CosNotifyComm.StructuredPullSupplier)obj;
		}
		else
		{
			org.omg.CosNotifyComm._StructuredPullSupplierStub stub;
			stub = new org.omg.CosNotifyComm._StructuredPullSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
