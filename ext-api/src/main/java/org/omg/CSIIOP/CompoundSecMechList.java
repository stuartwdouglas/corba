package org.omg.CSIIOP;

/**
 * Generated from IDL struct "CompoundSecMechList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class CompoundSecMechList
	implements org.omg.CORBA.portable.IDLEntity
{
	public CompoundSecMechList(){}
	public boolean stateful;
	public org.omg.CSIIOP.CompoundSecMech[] mechanism_list;
	public CompoundSecMechList(boolean stateful, org.omg.CSIIOP.CompoundSecMech[] mechanism_list)
	{
		this.stateful = stateful;
		this.mechanism_list = mechanism_list;
	}
}
