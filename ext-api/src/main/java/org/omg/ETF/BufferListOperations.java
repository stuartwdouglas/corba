package org.omg.ETF;


/**
 * Generated from IDL interface "BufferList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public interface BufferListOperations
{
	/* constants */
	/* operations  */
	int add_buffer(int size, org.omg.ETF.BufferHolder buf);
	int num_buffers();
	void get_buffer(int index, org.omg.ETF.BufferHolder buf);
	void release_buffers();
}
