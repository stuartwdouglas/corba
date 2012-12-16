package org.omg.CosPropertyService;


/**
 * This class contains generated Interface Repository information.
 * @author JacORB IDL compiler.
 */

public class PropertySetDefIRHelper
{
	public static java.util.Hashtable irInfo = new java.util.Hashtable();
	static
	{
		irInfo.put("define_properties_with_modes", "(in:property_defs org.omg.CosPropertyService.PropertyDefs)");
		irInfo.put("get_property_modes", "(in:property_names org.omg.CosPropertyService.PropertyNames,out:property_modes org.omg.CosPropertyService.PropertyModes)");
		irInfo.put("set_property_modes", "(in:property_modes org.omg.CosPropertyService.PropertyModes)");
		irInfo.put("get_allowed_properties", "(out:property_defs org.omg.CosPropertyService.PropertyDefs)");
		irInfo.put("get_allowed_property_types", "(out:property_types org.omg.CosPropertyService.PropertyTypes)");
		irInfo.put("get_property_mode", "(in:property_name org.omg.CosPropertyService.PropertyName)");
		irInfo.put("define_property_with_mode", "(in:property_name org.omg.CosPropertyService.PropertyName,in:property_value ,in:property_mode )");
		irInfo.put("set_property_mode", "(in:property_name org.omg.CosPropertyService.PropertyName,in:property_mode )");
	}
}
