package org.omg.CORBA;


/**
 * Generated from IDL interface "OperationDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public interface OperationDefOperations
	extends org.omg.CORBA.ContainedOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.TypeCode result();
	org.omg.CORBA.IDLType result_def();
	void result_def(org.omg.CORBA.IDLType arg);
	org.omg.CORBA.ParameterDescription[] params();
	void params(org.omg.CORBA.ParameterDescription[] arg);
	org.omg.CORBA.OperationMode mode();
	void mode(org.omg.CORBA.OperationMode arg);
	java.lang.String[] contexts();
	void contexts(java.lang.String[] arg);
	org.omg.CORBA.ExceptionDef[] exceptions();
	void exceptions(org.omg.CORBA.ExceptionDef[] arg);
}
