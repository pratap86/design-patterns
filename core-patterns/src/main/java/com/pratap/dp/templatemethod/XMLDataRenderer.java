package com.pratap.dp.templatemethod;

public class XMLDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "XML Data";
	}

	@Override
	public String processData(String data) {
		return "Processed "+data;
	}

}
