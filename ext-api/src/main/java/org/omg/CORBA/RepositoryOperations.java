package org.omg.CORBA;


/**
 * Generated from IDL interface "Repository".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public interface RepositoryOperations
	extends org.omg.CORBA.ContainerOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Contained lookup_id(java.lang.String search_id);
	org.omg.CORBA.TypeCode get_canonical_typecode(org.omg.CORBA.TypeCode tc);
	org.omg.CORBA.PrimitiveDef get_primitive(org.omg.CORBA.PrimitiveKind kind);
	org.omg.CORBA.StringDef create_string(int bound);
	org.omg.CORBA.WstringDef create_wstring(int bound);
	org.omg.CORBA.SequenceDef create_sequence(int bound, org.omg.CORBA.IDLType element_type);
	org.omg.CORBA.ArrayDef create_array(int length, org.omg.CORBA.IDLType element_type);
	org.omg.CORBA.FixedDef create_fixed(short digits, short scale);
}
