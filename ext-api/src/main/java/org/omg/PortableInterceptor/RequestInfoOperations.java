package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "RequestInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public interface RequestInfoOperations
{
	/* constants */
	/* operations  */
	int request_id();
	java.lang.String operation();
	org.omg.Dynamic.Parameter[] arguments();
	org.omg.CORBA.TypeCode[] exceptions();
	java.lang.String[] contexts();
	java.lang.String[] operation_context();
	org.omg.CORBA.Any result();
	boolean response_expected();
	short sync_scope();
	short reply_status();
	org.omg.CORBA.Object forward_reference();
	org.omg.CORBA.Any get_slot(int id) throws org.omg.PortableInterceptor.InvalidSlot;
	org.omg.IOP.ServiceContext get_request_service_context(int id);
	org.omg.IOP.ServiceContext get_reply_service_context(int id);
}
