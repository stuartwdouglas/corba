package org.omg.dds;

/**
 * Generated from IDL struct "SampleInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class SampleInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	public SampleInfo(){}
	public int sample_state;
	public int view_state;
	public int instance_state;
	public org.omg.dds.Time_t source_timestamp;
	public int instance_handle;
	public int disposed_generation_count;
	public int no_writers_generation_count;
	public int sample_rank;
	public int generation_rank;
	public int absolute_generation_rank;
	public SampleInfo(int sample_state, int view_state, int instance_state, org.omg.dds.Time_t source_timestamp, int instance_handle, int disposed_generation_count, int no_writers_generation_count, int sample_rank, int generation_rank, int absolute_generation_rank)
	{
		this.sample_state = sample_state;
		this.view_state = view_state;
		this.instance_state = instance_state;
		this.source_timestamp = source_timestamp;
		this.instance_handle = instance_handle;
		this.disposed_generation_count = disposed_generation_count;
		this.no_writers_generation_count = no_writers_generation_count;
		this.sample_rank = sample_rank;
		this.generation_rank = generation_rank;
		this.absolute_generation_rank = absolute_generation_rank;
	}
}
