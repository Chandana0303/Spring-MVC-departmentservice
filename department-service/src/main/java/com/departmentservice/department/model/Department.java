package com.departmentservice.department.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "dept")
public class Department {
	
	@Id
	private String deptId;
	private String deptName;
	private String deptLoc;

}


