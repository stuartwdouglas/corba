package org.omg.ETF;


/**
 * Generated from IDL interface "ConnectionZeroCopy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public interface ConnectionZeroCopyOperations
	extends org.omg.ETF.ConnectionOperations
{
	/* constants */
	/* operations  */
	org.omg.ETF.BufferList create_buffer_list();
	void write_zc(org.omg.ETF.BufferListHolder data, long time_out);
	void read_zc(org.omg.ETF.BufferListHolder data, int min_length, long time_out);
}
