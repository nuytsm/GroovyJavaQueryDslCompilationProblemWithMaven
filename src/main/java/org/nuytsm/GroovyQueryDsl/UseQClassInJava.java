package org.nuytsm.GroovyQueryDsl;


public class UseQClassInJava {
	
	//should work with the groovy compiler
	SomePersonEntity somePerson = new SomePersonEntity();
	
	//Does not work: Q class isn't generated in the target folder..
	QSomePersonEntity qspe;

}
