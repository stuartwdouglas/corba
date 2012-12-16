package org.omg.CosNotifyCommAck;


/**
 * Generated from IDL interface "SequencePullSupplierAck".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:54 PM
 */

public final class SequencePullSupplierAckHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyCommAck.SequencePullSupplierAck s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyCommAck.SequencePullSupplierAck extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyCommAck/SequencePullSupplierAck:1.0", "SequencePullSupplierAck");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyCommAck/SequencePullSupplierAck:1.0";
	}
	public static SequencePullSupplierAck read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotifyCommAck._SequencePullSupplierAckStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyCommAck.SequencePullSupplierAck s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyCommAck.SequencePullSupplierAck narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyCommAck.SequencePullSupplierAck)
		{
			return (org.omg.CosNotifyCommAck.SequencePullSupplierAck)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotifyCommAck/SequencePullSupplierAck:1.0"))
		{
			org.omg.CosNotifyCommAck._SequencePullSupplierAckStub stub;
			stub = new org.omg.CosNotifyCommAck._SequencePullSupplierAckStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotifyCommAck.SequencePullSupplierAck unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyCommAck.SequencePullSupplierAck)
		{
			return (org.omg.CosNotifyCommAck.SequencePullSupplierAck)obj;
		}
		else
		{
			org.omg.CosNotifyCommAck._SequencePullSupplierAckStub stub;
			stub = new org.omg.CosNotifyCommAck._SequencePullSupplierAckStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
