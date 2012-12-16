package org.omg.CONV_FRAME;

/**
 * Generated from IDL struct "CodeSetComponentInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class CodeSetComponentInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	public CodeSetComponentInfo(){}
	public org.omg.CONV_FRAME.CodeSetComponent ForCharData;
	public org.omg.CONV_FRAME.CodeSetComponent ForWcharData;
	public CodeSetComponentInfo(org.omg.CONV_FRAME.CodeSetComponent ForCharData, org.omg.CONV_FRAME.CodeSetComponent ForWcharData)
	{
		this.ForCharData = ForCharData;
		this.ForWcharData = ForWcharData;
	}
}
