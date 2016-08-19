package com.flp.ems.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="CAP_FLP_Employee")
public class Employee {
	
	//member variables
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;

    @NotEmpty(message="* Please Enter FirstName.")
	private String name;
    
    @NotEmpty(message="* Please Enter Kin id")
	private String kin_id;
    
	@NotEmpty(message="* Please Enter an email.")
	@Email(message="* Please Enter a valid email.")
	private String email_id; 
	

	private int phone_no;
	
	@Past(message="* Enter a valid past dob")
	private Date date_of_birth;
	
    @Future(message ="* Enter a valid future doj ")
    private Date date_of_joining;
    
    private String address;
    
 
    @ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="departId_fk")
	private Department department;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="projectId_fk")
	private Project project;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="roleId_fk")
	private Role role;

    
    //constructor
	public Employee() {
		empId=-1;
	}


	//getter and setter
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getKin_id() {
		return kin_id;
	}


	public void setKin_id(String kin_id) {
		this.kin_id = kin_id;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public Date getDate_of_birth() {
		return date_of_birth;
	}


	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}


	public Date getDate_of_joining() {
		return date_of_joining;
	}


	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Project getProject() {
		return project;
	}


	public void setProject(Project project) {
		this.project = project;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}
	
	

	public int getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", kin_id=" + kin_id + ", email_id=" + email_id
				+ ", date_of_birth=" + date_of_birth + ", date_of_joining=" + date_of_joining + ", address=" + address
				+ ", department=" + department + ", project=" + project + ", role=" + role + "]";
	}


	public Employee(int empId, String name, String kin_id, String email_id, Date date_of_birth, Date date_of_joining,
			String address, Department department, Project project, Role role) {
		super();
		this.empId = empId;
		this.name = name;
		this.kin_id = kin_id;
		this.email_id = email_id;
		this.date_of_birth = date_of_birth;
		this.date_of_joining = date_of_joining;
		this.address = address;
		this.department = department;
		this.project = project;
		this.role = role;
	}

	
	
	
}
