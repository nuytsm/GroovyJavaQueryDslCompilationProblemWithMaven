package org.nuytsm.GroovyQueryDsl

import javax.persistence.Basic
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "T_SOMEPERSONENTITY")
class SomePersonEntity {
	
	@Basic
	String name
	@Basic
	int age

}
