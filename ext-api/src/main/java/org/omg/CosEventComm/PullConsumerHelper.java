package org.omg.CosEventComm;


/**
 * Generated from IDL interface "PullConsumer".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:42 PM
 */

public final class PullConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosEventComm.PullConsumer s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosEventComm.PullConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosEventComm/PullConsumer:1.0", "PullConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventComm/PullConsumer:1.0";
	}
	public static PullConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosEventComm._PullConsumerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosEventComm.PullConsumer s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosEventComm.PullConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventComm.PullConsumer)
		{
			return (org.omg.CosEventComm.PullConsumer)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosEventComm/PullConsumer:1.0"))
		{
			org.omg.CosEventComm._PullConsumerStub stub;
			stub = new org.omg.CosEventComm._PullConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosEventComm.PullConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventComm.PullConsumer)
		{
			return (org.omg.CosEventComm.PullConsumer)obj;
		}
		else
		{
			org.omg.CosEventComm._PullConsumerStub stub;
			stub = new org.omg.CosEventComm._PullConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
