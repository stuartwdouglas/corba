package org.omg.CosEventComm;


/**
 * Generated from IDL interface "PushSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class PushSupplierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosEventComm.PushSupplier s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosEventComm.PushSupplier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosEventComm/PushSupplier:1.0", "PushSupplier");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventComm/PushSupplier:1.0";
	}
	public static PushSupplier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosEventComm._PushSupplierStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosEventComm.PushSupplier s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosEventComm.PushSupplier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventComm.PushSupplier)
		{
			return (org.omg.CosEventComm.PushSupplier)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosEventComm/PushSupplier:1.0"))
		{
			org.omg.CosEventComm._PushSupplierStub stub;
			stub = new org.omg.CosEventComm._PushSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosEventComm.PushSupplier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventComm.PushSupplier)
		{
			return (org.omg.CosEventComm.PushSupplier)obj;
		}
		else
		{
			org.omg.CosEventComm._PushSupplierStub stub;
			stub = new org.omg.CosEventComm._PushSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
