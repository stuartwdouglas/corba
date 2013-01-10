package org.omg.dds;


/**
 * Generated from IDL interface "TopicDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public abstract class TopicDescriptionPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.dds.TopicDescriptionOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "get_participant", new java.lang.Integer(0));
		m_opsHash.put ( "get_type_name", new java.lang.Integer(1));
		m_opsHash.put ( "get_name", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:omg.org/dds/TopicDescription:1.0"};
	public org.omg.dds.TopicDescription _this()
	{
		return org.omg.dds.TopicDescriptionHelper.narrow(_this_object());
	}
	public org.omg.dds.TopicDescription _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.dds.TopicDescriptionHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // get_participant
			{
				_out = handler.createReply();
				org.omg.dds.DomainParticipantHelper.write(_out,get_participant());
				break;
			}
			case 1: // get_type_name
			{
				_out = handler.createReply();
				_out.write_string(get_type_name());
				break;
			}
			case 2: // get_name
			{
				_out = handler.createReply();
				_out.write_string(get_name());
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
