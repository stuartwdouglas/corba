package org.omg.PortableServer;


/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public interface CurrentOperations
	extends org.omg.CORBA.CurrentOperations
{
	/* constants */
	/* operations  */
	org.omg.PortableServer.POA get_POA() throws org.omg.PortableServer.CurrentPackage.NoContext;
	byte[] get_object_id() throws org.omg.PortableServer.CurrentPackage.NoContext;
	org.omg.CORBA.Object get_reference() throws org.omg.PortableServer.CurrentPackage.NoContext;
	org.omg.PortableServer.Servant get_servant() throws org.omg.PortableServer.CurrentPackage.NoContext;
}
