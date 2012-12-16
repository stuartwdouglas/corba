package org.omg.PortableServer;


/**
 * Generated from IDL interface "ServantActivator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public interface ServantActivatorOperations
	extends org.omg.PortableServer.ServantManagerOperations
{
	/* constants */
	/* operations  */
	org.omg.PortableServer.Servant incarnate(byte[] oid, org.omg.PortableServer.POA adapter) throws org.omg.PortableServer.ForwardRequest;
	void etherealize(byte[] oid, org.omg.PortableServer.POA adapter, org.omg.PortableServer.Servant serv, boolean cleanup_in_progress, boolean remaining_activations);
}
