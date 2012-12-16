package org.omg.CONV_FRAME;

/**
 * Generated from IDL struct "CodeSetComponent".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class CodeSetComponent
	implements org.omg.CORBA.portable.IDLEntity
{
	public CodeSetComponent(){}
	public int native_code_set;
	public int[] conversion_code_sets;
	public CodeSetComponent(int native_code_set, int[] conversion_code_sets)
	{
		this.native_code_set = native_code_set;
		this.conversion_code_sets = conversion_code_sets;
	}
}
