package org.omg.Security;

/**
 * Generated from IDL struct "MechandOptions".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class MechandOptions
	implements org.omg.CORBA.portable.IDLEntity
{
	public MechandOptions(){}
	public java.lang.String mechanism_type;
	public short options_supported;
	public MechandOptions(java.lang.String mechanism_type, short options_supported)
	{
		this.mechanism_type = mechanism_type;
		this.options_supported = options_supported;
	}
}
