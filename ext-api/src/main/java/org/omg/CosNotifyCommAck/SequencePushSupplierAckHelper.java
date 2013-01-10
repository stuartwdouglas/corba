package org.omg.CosNotifyCommAck;


/**
 * Generated from IDL interface "SequencePushSupplierAck".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class SequencePushSupplierAckHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyCommAck.SequencePushSupplierAck s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyCommAck.SequencePushSupplierAck extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyCommAck/SequencePushSupplierAck:1.0", "SequencePushSupplierAck");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyCommAck/SequencePushSupplierAck:1.0";
	}
	public static SequencePushSupplierAck read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotifyCommAck._SequencePushSupplierAckStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyCommAck.SequencePushSupplierAck s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyCommAck.SequencePushSupplierAck narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyCommAck.SequencePushSupplierAck)
		{
			return (org.omg.CosNotifyCommAck.SequencePushSupplierAck)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotifyCommAck/SequencePushSupplierAck:1.0"))
		{
			org.omg.CosNotifyCommAck._SequencePushSupplierAckStub stub;
			stub = new org.omg.CosNotifyCommAck._SequencePushSupplierAckStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotifyCommAck.SequencePushSupplierAck unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyCommAck.SequencePushSupplierAck)
		{
			return (org.omg.CosNotifyCommAck.SequencePushSupplierAck)obj;
		}
		else
		{
			org.omg.CosNotifyCommAck._SequencePushSupplierAckStub stub;
			stub = new org.omg.CosNotifyCommAck._SequencePushSupplierAckStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
