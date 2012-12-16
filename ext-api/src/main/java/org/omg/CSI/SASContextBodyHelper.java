package org.omg.CSI;

/**
 * Generated from IDL union "SASContextBody".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class SASContextBodyHelper
{
	private static org.omg.CORBA.TypeCode _type;
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSI.SASContextBody s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSI.SASContextBody extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSI/SASContextBody:1.0";
	}
	public static SASContextBody read (org.omg.CORBA.portable.InputStream in)
	{
		SASContextBody result = new SASContextBody ();
		short disc=in.read_short();
		switch (disc)
		{
			case 0:
			{
				org.omg.CSI.EstablishContext _var;
				_var=org.omg.CSI.EstablishContextHelper.read(in);
				result.establish_msg (_var);
				break;
			}
			case 1:
			{
				org.omg.CSI.CompleteEstablishContext _var;
				_var=org.omg.CSI.CompleteEstablishContextHelper.read(in);
				result.complete_msg (_var);
				break;
			}
			case 4:
			{
				org.omg.CSI.ContextError _var;
				_var=org.omg.CSI.ContextErrorHelper.read(in);
				result.error_msg (_var);
				break;
			}
			case 5:
			{
				org.omg.CSI.MessageInContext _var;
				_var=org.omg.CSI.MessageInContextHelper.read(in);
				result.in_context_msg (_var);
				break;
			}
			default: result.__default (disc);
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, SASContextBody s)
	{
		out.write_short(s.discriminator ());
		switch (s.discriminator ())
		{
			case 0:
			{
				org.omg.CSI.EstablishContextHelper.write(out,s.establish_msg ());
				break;
			}
			case 1:
			{
				org.omg.CSI.CompleteEstablishContextHelper.write(out,s.complete_msg ());
				break;
			}
			case 4:
			{
				org.omg.CSI.ContextErrorHelper.write(out,s.error_msg ());
				break;
			}
			case 5:
			{
				org.omg.CSI.MessageInContextHelper.write(out,s.in_context_msg ());
				break;
			}
		}
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[4];
			org.omg.CORBA.Any label_any;
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_short ((short)0);
			members[0] = new org.omg.CORBA.UnionMember ("establish_msg", label_any, org.omg.CSI.EstablishContextHelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_short ((short)1);
			members[1] = new org.omg.CORBA.UnionMember ("complete_msg", label_any, org.omg.CSI.CompleteEstablishContextHelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_short ((short)4);
			members[2] = new org.omg.CORBA.UnionMember ("error_msg", label_any, org.omg.CSI.ContextErrorHelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			label_any.insert_short ((short)5);
			members[3] = new org.omg.CORBA.UnionMember ("in_context_msg", label_any, org.omg.CSI.MessageInContextHelper.type(),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"SASContextBody",org.omg.CSI.MsgTypeHelper.type(), members);
		}
		return _type;
	}
}
