package com.stackroute.datamunger.query;

import java.util.LinkedHashMap;

//This class will be acting as the DataSet containing multiple rows
public class DataSet extends LinkedHashMap<Long, Row> {

	private static final long serialVersionUID = 1L;
	LinkedHashMap<Long, Row> dataSet;

	public DataSet() {

	}

	public DataSet(LinkedHashMap<Long, Row> dataSet) {
		this.dataSet.putAll(dataSet);

	}

	public LinkedHashMap<Long, Row> getDataSet() {
		return dataSet;
	}

	public void setDataSet(LinkedHashMap<Long, Row> dataSet) {
		this.dataSet.putAll(dataSet);
	}

}
