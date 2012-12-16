package org.omg.IOP;


/**
 * Generated from IDL interface "Codec".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public interface CodecOperations
{
	/* constants */
	/* operations  */
	byte[] encode(org.omg.CORBA.Any data) throws org.omg.IOP.CodecPackage.InvalidTypeForEncoding;
	org.omg.CORBA.Any decode(byte[] data) throws org.omg.IOP.CodecPackage.FormatMismatch;
	byte[] encode_value(org.omg.CORBA.Any data) throws org.omg.IOP.CodecPackage.InvalidTypeForEncoding;
	org.omg.CORBA.Any decode_value(byte[] data, org.omg.CORBA.TypeCode tc) throws org.omg.IOP.CodecPackage.TypeMismatch,org.omg.IOP.CodecPackage.FormatMismatch;
}
