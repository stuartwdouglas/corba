package org.omg.CSI;

/**
 * Generated from IDL struct "CompleteEstablishContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class CompleteEstablishContext
	implements org.omg.CORBA.portable.IDLEntity
{
	public CompleteEstablishContext(){}
	public long client_context_id;
	public boolean context_stateful;
	public byte[] final_context_token;
	public CompleteEstablishContext(long client_context_id, boolean context_stateful, byte[] final_context_token)
	{
		this.client_context_id = client_context_id;
		this.context_stateful = context_stateful;
		this.final_context_token = final_context_token;
	}
}
