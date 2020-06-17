package com.pratap.dp.abstractfactory;

public class Test {

	public static void main(String[] args) {
		
		DaoAbstractFactory produce = DaoFactoryProducer.produce("xml");
		
		Dao dao = produce.createDao("dept");
		dao.save();
	}

}
