package org.omg.CosNotifyComm;


/**
 * Generated from IDL interface "StructuredPushConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class StructuredPushConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyComm.StructuredPushConsumer s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyComm.StructuredPushConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyComm/StructuredPushConsumer:1.0", "StructuredPushConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/StructuredPushConsumer:1.0";
	}
	public static StructuredPushConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotifyComm._StructuredPushConsumerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyComm.StructuredPushConsumer s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyComm.StructuredPushConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyComm.StructuredPushConsumer)
		{
			return (org.omg.CosNotifyComm.StructuredPushConsumer)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotifyComm/StructuredPushConsumer:1.0"))
		{
			org.omg.CosNotifyComm._StructuredPushConsumerStub stub;
			stub = new org.omg.CosNotifyComm._StructuredPushConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotifyComm.StructuredPushConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyComm.StructuredPushConsumer)
		{
			return (org.omg.CosNotifyComm.StructuredPushConsumer)obj;
		}
		else
		{
			org.omg.CosNotifyComm._StructuredPushConsumerStub stub;
			stub = new org.omg.CosNotifyComm._StructuredPushConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
