package org.omg.CORBA;

/**
 * Generated from IDL interface "ModuleDef".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class ModuleDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public ModuleDef value;
	public ModuleDefHolder()
	{
	}
	public ModuleDefHolder (final ModuleDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ModuleDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ModuleDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ModuleDefHelper.write (_out,value);
	}
}
