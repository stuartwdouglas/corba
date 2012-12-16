package org.omg.Dynamic;

/**
 * Generated from IDL struct "Parameter".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class Parameter
	implements org.omg.CORBA.portable.IDLEntity
{
	public Parameter(){}
	public org.omg.CORBA.Any argument;
	public org.omg.CORBA.ParameterMode mode;
	public Parameter(org.omg.CORBA.Any argument, org.omg.CORBA.ParameterMode mode)
	{
		this.argument = argument;
		this.mode = mode;
	}
}
