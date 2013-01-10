package org.omg.CSI;

/**
 * Generated from IDL struct "MessageInContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class MessageInContext
	implements org.omg.CORBA.portable.IDLEntity
{
	public MessageInContext(){}
	public long client_context_id;
	public boolean discard_context;
	public MessageInContext(long client_context_id, boolean discard_context)
	{
		this.client_context_id = client_context_id;
		this.discard_context = discard_context;
	}
}
