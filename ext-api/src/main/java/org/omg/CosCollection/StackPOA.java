package org.omg.CosCollection;


/**
 * Generated from IDL interface "Stack".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public abstract class StackPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.StackOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "purge", new java.lang.Integer(0));
		m_opsHash.put ( "unfilled", new java.lang.Integer(1));
		m_opsHash.put ( "size", new java.lang.Integer(2));
		m_opsHash.put ( "pop", new java.lang.Integer(3));
		m_opsHash.put ( "top", new java.lang.Integer(4));
		m_opsHash.put ( "element_pop", new java.lang.Integer(5));
		m_opsHash.put ( "push", new java.lang.Integer(6));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/Stack:1.0","IDL:omg.org/CosCollection/RestrictedAccessCollection:1.0"};
	public org.omg.CosCollection.Stack _this()
	{
		return org.omg.CosCollection.StackHelper.narrow(_this_object());
	}
	public org.omg.CosCollection.Stack _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosCollection.StackHelper.narrow(_this_object(orb));
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
			case 0: // purge
			{
				_out = handler.createReply();
				purge();
				break;
			}
			case 1: // unfilled
			{
				_out = handler.createReply();
				_out.write_boolean(unfilled());
				break;
			}
			case 2: // size
			{
				_out = handler.createReply();
				_out.write_ulong(size());
				break;
			}
			case 3: // pop
			{
			try
			{
				_out = handler.createReply();
				pop();
			}
			catch(org.omg.CosCollection.EmptyCollection _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.EmptyCollectionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // top
			{
			try
			{
				org.omg.CORBA.AnyHolder _arg0= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(top(_arg0));
				_out.write_any(_arg0.value);
			}
			catch(org.omg.CosCollection.EmptyCollection _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.EmptyCollectionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // element_pop
			{
			try
			{
				org.omg.CORBA.AnyHolder _arg0= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(element_pop(_arg0));
				_out.write_any(_arg0.value);
			}
			catch(org.omg.CosCollection.EmptyCollection _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.EmptyCollectionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // push
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				push(_arg0);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
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
