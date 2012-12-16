package org.omg.Security;


/**
 * Generated from IDL struct "AuditEventType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class AuditEventTypeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Security.AuditEventTypeHelper.id(),"AuditEventType",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("event_family", org.omg.Security.ExtensibleFamilyHelper.type(), null),new org.omg.CORBA.StructMember("event_type", org.omg.Security.EventTypeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.AuditEventType s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.AuditEventType extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Security/AuditEventType:1.0";
	}
	public static org.omg.Security.AuditEventType read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.Security.AuditEventType result = new org.omg.Security.AuditEventType();
		result.event_family=org.omg.Security.ExtensibleFamilyHelper.read(in);
		result.event_type=in.read_ushort();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.Security.AuditEventType s)
	{
		org.omg.Security.ExtensibleFamilyHelper.write(out,s.event_family);
		out.write_ushort(s.event_type);
	}
}
