package org.omg.CosTypedEventChannelAdmin;


/**
 * Generated from IDL interface "TypedEventChannel".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:53 PM
 */

public abstract class TypedEventChannelPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTypedEventChannelAdmin.TypedEventChannelOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "for_consumers", new java.lang.Integer(0));
		m_opsHash.put ( "destroy", new java.lang.Integer(1));
		m_opsHash.put ( "for_suppliers", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:omg.org/CosTypedEventChannelAdmin/TypedEventChannel:1.0"};
	public org.omg.CosTypedEventChannelAdmin.TypedEventChannel _this()
	{
		return org.omg.CosTypedEventChannelAdmin.TypedEventChannelHelper.narrow(_this_object());
	}
	public org.omg.CosTypedEventChannelAdmin.TypedEventChannel _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTypedEventChannelAdmin.TypedEventChannelHelper.narrow(_this_object(orb));
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
			case 0: // for_consumers
			{
				_out = handler.createReply();
				org.omg.CosTypedEventChannelAdmin.TypedConsumerAdminHelper.write(_out,for_consumers());
				break;
			}
			case 1: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 2: // for_suppliers
			{
				_out = handler.createReply();
				org.omg.CosTypedEventChannelAdmin.TypedSupplierAdminHelper.write(_out,for_suppliers());
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
