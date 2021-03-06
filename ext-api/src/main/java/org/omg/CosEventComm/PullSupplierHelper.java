package org.omg.CosEventComm;


/**
 * Generated from IDL interface "PullSupplier".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class PullSupplierHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosEventComm.PullSupplier s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosEventComm.PullSupplier extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosEventComm/PullSupplier:1.0", "PullSupplier");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventComm/PullSupplier:1.0";
	}
	public static PullSupplier read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosEventComm._PullSupplierStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosEventComm.PullSupplier s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosEventComm.PullSupplier narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventComm.PullSupplier)
		{
			return (org.omg.CosEventComm.PullSupplier)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosEventComm/PullSupplier:1.0"))
		{
			org.omg.CosEventComm._PullSupplierStub stub;
			stub = new org.omg.CosEventComm._PullSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosEventComm.PullSupplier unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventComm.PullSupplier)
		{
			return (org.omg.CosEventComm.PullSupplier)obj;
		}
		else
		{
			org.omg.CosEventComm._PullSupplierStub stub;
			stub = new org.omg.CosEventComm._PullSupplierStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
