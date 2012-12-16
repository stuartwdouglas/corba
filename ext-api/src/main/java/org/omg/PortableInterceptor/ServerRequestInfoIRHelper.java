package org.omg.PortableInterceptor;


/**
 * This class contains generated Interface Repository information.
 * @author JacORB IDL compiler.
 */

public class ServerRequestInfoIRHelper
{
	public static java.util.Hashtable irInfo = new java.util.Hashtable();
	static
	{
		irInfo.put("target_is_a", "(in:id org.omg.CORBA.RepositoryId)");
		irInfo.put("sending_exception", "attribute;org.omg.CORBA.Any");
		irInfo.put("target_most_derived_interface", "attribute;org.omg.CORBA.RepositoryId");
		irInfo.put("set_slot", "(in:id org.omg.PortableInterceptor.SlotId,in:data )");
		irInfo.put("add_reply_service_context", "(in:service_context ,in:replace )");
		irInfo.put("adapter_id", "attribute;org.omg.CORBA.OctetSeq");
		irInfo.put("get_server_policy", "(in:type org.omg.CORBA.PolicyType)");
		irInfo.put("object_id", "attribute;org.omg.CORBA.OctetSeq");
	}
}
